/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.utils;

import com.alibaba.fastjson.JSON;
import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.config.MerConfig;
import com.huifu.bspay.sdk.opps.core.exception.BasePayException;
import com.huifu.bspay.sdk.opps.core.exception.FailureCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.*;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.*;
import java.io.*;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kefeng.zheng
 * @version v 0.1
 */
public class HttpClientUtils {

    private static CloseableHttpClient httpClient;
    private static RequestConfig requestConfig;
    private static int connectionRequestTimeout = 30000;
    private static int socketTimeout = 20000;
    private static int connectTimout = 20000;
    private static final ReentrantLock lock = new ReentrantLock();

    public static CloseableHttpClient getHttpClient(String url) {
        URL aUrl = null;
        try {
            aUrl = new URL(url);
        } catch (Exception ex) {
            return null;
        }

        int port = 80;
        if ("https".equals(aUrl.getProtocol())) {
            port = aUrl.getPort() == -1 ? 443 : aUrl.getPort();
        } else {
            port = aUrl.getPort() == -1 ? 80 : aUrl.getPort();
        }
        String hostname = aUrl.getHost();

        if (httpClient == null) {
            lock.lock();
            try {
                if (httpClient == null) {
                    httpClient = createHttpClient(500, 40, 100, hostname, port);
                }
            } finally {
                lock.unlock();
            }
        }
        return httpClient;
    }

    public static CloseableHttpClient createHttpClient(int maxTotal, int maxPerRoute, int maxRoute, String hostname,
                                                       int port) {
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        SSLContext sslcontext = SSLContexts.createDefault();
        TrustManager[] trustAllCerts = new TrustManager[1];
        X509TrustManager tm = getX509TrustManager();
        trustAllCerts[0] = tm;
        try {
            sslcontext.init(null, trustAllCerts, null);
        } catch (KeyManagementException localKeyManagementException) {
        }

        HostnameVerifier hostnameVerifier = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        LayeredConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, hostnameVerifier);

        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", plainsf).register("https", sslsf).build();
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry, null, null, null, 5L, TimeUnit.MINUTES);

        cm.setMaxTotal(maxTotal);

        cm.setDefaultMaxPerRoute(maxPerRoute);
        HttpHost httpHost = new HttpHost(hostname, port);

        cm.setMaxPerRoute(new HttpRoute(httpHost), maxRoute);

        HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
                if (executionCount >= 3) {
                    return false;
                }
                if ((exception instanceof NoHttpResponseException)) {
                    return true;
                }
                if ((exception instanceof SSLHandshakeException)) {
                    return false;
                }
                if ((exception instanceof InterruptedIOException)) {
                    return false;
                }
                if ((exception instanceof UnknownHostException)) {
                    return false;
                }
                if ((exception instanceof SSLException)) {
                    return false;
                }
                HttpClientContext clientContext = HttpClientContext.adapt(context);
                HttpRequest request = clientContext.getRequest();
                if (!(request instanceof HttpEntityEnclosingRequest)) {
                    return true;
                }
                return false;
            }
        };

        if (requestConfig == null) {
            initRequestConfig();
        }
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm)
                .setDefaultRequestConfig(requestConfig).setRetryHandler(httpRequestRetryHandler).build();

        closeExpiredConnectionsPeriodTask(1, cm);

        return httpClient;
    }

    public static X509TrustManager getX509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] arg0, String arg1) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] arg0, String arg1) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
    }

    private static void closeExpiredConnectionsPeriodTask(int timeUnitBySecond, PoolingHttpClientConnectionManager cm) {
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (cm != null) {
                    cm.closeExpiredConnections();
                }
            }
        }, 10L, timeUnitBySecond, TimeUnit.MINUTES);
    }

    static void initRequestConfig() {
        requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimout)
                .setConnectionRequestTimeout(connectionRequestTimeout).build();
    }

    public static String httpPost(String url, Map<String, Object> params, boolean isJson) throws BasePayException {
        return httpPost(url, null, params, false, null, isJson, null, null);
    }

    public static String httpPost(String url, Map<String, String> headers, Map<String, Object> params)
            throws BasePayException {
        return httpPost(url, headers, params, false, null, false, null, null);
    }

    public static String httpPostJson(String url, Map<String, String> headers, String json) throws BasePayException {
        return httpPost(url, headers, null, false, json, true, null, null);
    }

    public static String httpPostFile(String url, Map<String, String> headers, Map<String, Object> params, File file,
                                      String fileParam) throws BasePayException {
        return httpPost(url, headers, params, false, null, false, file, fileParam);
    }

    public static String httpPostNoFile(String url, Map<String, String> headers, Map<String, Object> params, File file,
                                      String fileParam) throws BasePayException {
        HttpPost httpPost = new HttpPost(url);
        if (null != headers) {
            if (BasePay.debug) {
                System.out.println("request headers=" + JSON.toJSONString(headers));
                System.out.println("request url = " + url);
                System.out.println("request param = " + null);
            }
            for (Iterator localIterator = headers.entrySet().iterator(); localIterator.hasNext(); ) {
                Map.Entry entry = (Map.Entry) localIterator.next();
                httpPost.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }

            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setCharset(Charset.forName("UTF-8"));
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addTextBody((String) entry.getKey(), entry.getValue().toString(),
                            ContentType.APPLICATION_FORM_URLENCODED.withCharset("utf-8"));
                }
            }
            httpPost.setEntity(builder.build());



        return getResult(httpPost, url, false);

    }
    public static String httpPost(String url, Map<String, Object> params, int connectionRequestTimeout,
                                  int connectTimeout, int socketTimeout, String json, boolean isJson) throws BasePayException {
        return httpPost(url, null, params, false, json, isJson, null, null);
    }

    @SuppressWarnings("rawtypes")
    public static String httpPost(String url, Map<String, String> headers, Map<String, Object> params, boolean isStream,
                                  String json, boolean isJson, File file, String fileParam) throws BasePayException {
        HttpPost httpPost = new HttpPost(url);
        if (null != headers) {
            if (BasePay.debug) {
                System.out.println("request headers=" + JSON.toJSONString(headers));
                System.out.println("request url = " + url);
                System.out.println("request param = " + json);
            }
            for (Iterator localIterator = headers.entrySet().iterator(); localIterator.hasNext(); ) {
                Map.Entry entry = (Map.Entry) localIterator.next();
                httpPost.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (file != null) {
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setCharset(Charset.forName("UTF-8"));
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.addPart(fileParam, new FileBody(file));
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addTextBody((String) entry.getKey(), entry.getValue().toString(),
                            ContentType.APPLICATION_FORM_URLENCODED.withCharset("utf-8"));
                }
            }
            httpPost.setEntity(builder.build());
        }
        if ((file == null) && (null != params)) {
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(covertParams2NVPS(params), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                if (BasePay.debug) {
                    e.printStackTrace();
                }
                throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
            }
        }
        if ((isJson) && (json != null) && (json.length() != 0)) {
            StringEntity entity = new StringEntity(json, "UTF-8");
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
        }
        return getResult(httpPost, url, isStream);
    }

    public static String httpGet(String url, Map<String, Object> params) throws BasePayException {
        return httpGet(url, null, params, 10000, 30000, 30000, false);
    }

    public static String httpGet(String url, Map<String, String> headers, Map<String, Object> params)
            throws BasePayException {
        return httpGet(url, headers, params, 10000, 30000, 30000, false);
    }

    public static String httpGet(String url, Map<String, Object> params, int connectionRequestTimeout,
                                 int connectTimeout, int socketTimeout) throws BasePayException {
        return httpGet(url, null, params, connectionRequestTimeout, connectTimeout, socketTimeout, false);
    }

    public static String httpGet(String url, Map<String, String> headers, Map<String, Object> params,
                                 int connectionRequestTimeout, int connectTimeout, int socketTimeout, boolean isStream)
            throws BasePayException {
        URIBuilder uriBuilder;
        try {
            uriBuilder = new URIBuilder(url);
        } catch (URISyntaxException e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
        }
        if (null != params) {
            uriBuilder.setParameters(covertParams2NVPS(params));
        }
        HttpGet httpGet;
        try {
            httpGet = new HttpGet(uriBuilder.build());
        } catch (Exception e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
        }
        if (null != headers) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpGet.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return getResult(httpGet, url, isStream);
    }

    private static String getResult(HttpRequestBase httpRequest, String url, boolean isStream) throws BasePayException {
        StringBuilder sb = new StringBuilder();
        CloseableHttpResponse response = null;
        BufferedReader br = null;
        CloseableHttpClient httpClient = null;
        try {

            if (!BasePay.userDefaultCloseableHttpClient) {
                httpClient = getHttpClient(url);
            } else {
                httpClient = HttpClients.createDefault();

                MerConfig merConfig= BasePay.getConfig("default");

                RequestConfig requestConfig = RequestConfig.custom()
                        .setConnectTimeout(Integer.parseInt(Optional.ofNullable(merConfig).map(MerConfig::getCustomConnectTimeout).orElse("30000")))
                        .setSocketTimeout(Integer.parseInt(Optional.ofNullable(merConfig).map(MerConfig::getCustomSocketTimeout).orElse("30000")))
                        .setConnectionRequestTimeout(Integer.parseInt(Optional.ofNullable(merConfig).map(MerConfig::getCustomConnectionRequestTimeout).orElse("30000")))
                        .build();
                httpRequest.setConfig(requestConfig);
            }

            response = httpClient.execute(httpRequest);
            int respCode = response.getStatusLine().getStatusCode();
            if (BasePay.debug) {
                System.out.println("response code = " + respCode);
            }
            if (200 == respCode) {
                HttpEntity entity = response.getEntity();
                if (isStream) {
                    br = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
                    String len;
                    while ((len = br.readLine()) != null) {
                        sb.append(len);
                    }
                } else {
                    sb.append(EntityUtils.toString(entity, "UTF-8"));
                }
            } else {
                sb.append(response.getEntity() == null ? "" : EntityUtils.toString(response.getEntity(), "UTF-8"));
            }
            return sb.toString();
        } catch (ConnectTimeoutException | SocketTimeoutException e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            if (e instanceof SocketTimeoutException) {
                throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request  fail, socket timeout exception.");
            }
            throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request fail, connection timeout.");
        } catch (UnsupportedOperationException | ParseException | IOException e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION, e);
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    if (BasePay.debug) {
                        e.printStackTrace();
                    }
                    throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
                }
            }
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    if (BasePay.debug) {
                        e.printStackTrace();
                    }
                    throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
                }
            }
            if (BasePay.userDefaultCloseableHttpClient) {
                if (null != httpClient) {
                    try {
                        httpClient.close();
                    } catch (IOException ioe) {
                        if (BasePay.debug) {
                            ioe.printStackTrace();
                        }
                        throw new BasePayException(FailureCode.SYSTEM_EXCEPTION);
                    }
                }
            }
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static List<NameValuePair> covertParams2NVPS(Map<String, Object> params) {
        List<NameValuePair> paramList = new LinkedList();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            paramList.add(new BasicNameValuePair((String) entry.getKey(),
                    null == entry.getValue() ? "" : entry.getValue().toString()));
        }
        return paramList;
    }
}
