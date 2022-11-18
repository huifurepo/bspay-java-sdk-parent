package com.huifu.bspay.sdk.opps.core.utils;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;

import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.exception.BasePayException;
import com.huifu.bspay.sdk.opps.core.exception.FailureCode;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/***
 * @Description: OkHttp工具类
 * @author: xianlong.shen
 * @date:2021年6月24日下午7:38:49 
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OkHttpClientTools {

	private static int readTimeout = 20000;
	
	private static int connectTimout = 20000;
	
	private static int writeTimeout = 30000;
    
    private static final int SUCCESS_CODE = 200;

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    
    /****
     * @Description:HttpResponse POST请求发送
     * @param: url：请求地址
     * @param: params：请求参数
     * @return: HttpResponse
     * @author: xianlong.shen
     * @date 2021年6月24日19:38:41
     * @version V1.0
     */
    public static String httpPost(String url, String jsonData, String productId) throws BasePayException {

        try {
        	
            RequestBody body = RequestBody.create(jsonData, JSON);
            
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(connectTimout, TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(readTimeout, TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
                    .build();
            
            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("version", "1.0.0")
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .post(body);
            
            Call call = client.newCall(builder.build());
            try {
            	
                Response response = call.execute();
                
                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                	if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }
                
                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }
                
                return responseData;
                
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail,IOException.");
            }

        } catch (Exception e) {
        	if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }
    
    /****
     * @Description:HttpResponse POST请求发送
     * @param: url：请求地址
     * @param: params：请求参数
     * @return: HttpResponse
     * @author: xianlong.shen
     * @date 2021年6月24日19:38:41
     * @version V1.0
     */
    public static String httpPostFile(String url, String jsonData, String productId, File file) throws BasePayException {

        try {
        	
        	if (file == null || !file.exists()) {
                return "文件不能为空";
            }
        	
        	RequestBody body = RequestBody.create(jsonData, JSON);
        	RequestBody fileBody = RequestBody.create(file, JSON);
            
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(connectTimout, TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(readTimeout, TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
                    .build();
            
            RequestBody multipartBody = new MultipartBody.Builder().setType(MultipartBody.ALTERNATIVE)
            .addFormDataPart("file", file.getName(), fileBody)
            .addPart(body)
            .build();
            
            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("version", "1.0.0")
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .post(multipartBody);
            
            Call call = client.newCall(builder.build());
            try {
            	
                Response response = call.execute();
                
                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                	if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }
                
                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }
                
                return responseData;
                
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail, IOException.");
            }

        } catch (Exception e) {
        	if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }
    
    /****
     * @Description:HttpResponse get请求发送
     * @param: url：请求地址
     * @param: params：请求参数
     * @return: HttpResponse
     * @author: xianlong.shen
     * @date 2021年6月24日19:47:01
     * @version V1.0
     */
    public static String httpGet(String url, String jsonData, String productId) throws BasePayException {

        try {
        	
            RequestBody body = RequestBody.create(jsonData, JSON);
            
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(connectTimout, TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(readTimeout, TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
                    .build();
            
            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .patch(body)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("version", "1.0.0")
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .get();
            
            Call call = client.newCall(builder.build());
            try {
            	
                Response response = call.execute();
                
                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                	if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }
                
                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }
                
                return responseData;
                
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                	if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
            }

        } catch (Exception e) {
        	if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }
    
}