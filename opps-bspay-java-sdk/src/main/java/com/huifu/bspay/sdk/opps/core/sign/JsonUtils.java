package com.huifu.bspay.sdk.opps.core.sign;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * json工具类;
 *
 * @author Frank Wang
 * @date 2021/9/2
 */
public class JsonUtils {
    /**
     * 对json string进行排序, 排序规则如下:
     * (1). 如果是对象, 则对对象中的所有的基本数据类型的属性按名称的ASCII升序排序;
     * (2). 如果是数组, 数组里面的item不进行排序;
     * (3). 若数组里面包含有对象,请参照规则1.
     *
     * @param sourceJson json字符串;
     * @param maxLayer   json允许的最大嵌套层数;
     * @return 排序好的json字符串.
     */
    public static String sort4JsonString(String sourceJson, int maxLayer) throws Exception {
        if (StringUtils.isBlank(sourceJson)) {
            return "";
        }

        Map m = JSONObject.parseObject(sourceJson, TreeMap.class);

        if(maxLayer > 0) {
          //对array中的元素顺序进行单独处理;
            for (Iterator it = m.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry entry = (Map.Entry) it.next();

                int layer = 0;
                if (entry.getValue() instanceof JSONArray) {
                    JSONArray array = (JSONArray) entry.getValue();

                    sortJsonArray(array, ++layer, maxLayer);
                }
            }
        }
        return JSON.toJSONString(m);
    }

    /**
     * 对json Array中的对象进行排序, 基础数据类型不排序.
     * <p>
     * 如果有嵌套, 则递归进行排序.
     *
     * @param array    JSONArray实例.
     * @param layer    json的当前处理的嵌套层数
     * @param maxLayer json允许最大嵌套层数.
     */
    private static void sortJsonArray(JSONArray array, int layer, int maxLayer) throws Exception {
        if (layer >= maxLayer) {
            throw new Exception(String.format("json嵌套层数不超过 %d 层.", maxLayer));
        }

        for (int i = 0; i < array.size(); i++) {
            //如果数组中嵌套数组, 则递归排序;
            if (array.get(i) instanceof JSONArray) {
                sortJsonArray((JSONArray) array.get(i), ++layer, maxLayer);
            } else if (!(array.get(i) instanceof Comparable)) {
                //对数组中的对象进行排序;
                Map map = JSON.parseObject(array.get(i).toString(), TreeMap.class);
                array.set(i, map);

                //如果对象中嵌套有数组, 则递归处理;
                for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
                    Map.Entry entry = (Map.Entry) it.next();

                    if (entry.getValue() instanceof JSONArray) {
                        sortJsonArray((JSONArray) entry.getValue(), ++layer, maxLayer);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String s1 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\"}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";
        String s2 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\",\"data\":[{\"name\":\"frank\",\"age\":25,\"colors\":[{\"name\":\"name\",\"color\":\"red\"}]}]}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";
        String s3 = "{\"array2\": [1,8,3,0],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1; i++) {
            //动态json;
            //String s2 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\",\"data\":[{\"name\":\"frank\",\"age\":25,\"colors\":[{\"name\":\"name\",\"color\":\"red\"}]}]}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\",\"ts\":" + System.currentTimeMillis() + "}";

            sort4JsonString(s2, 4);
            System.out.println(sort4JsonString(s2, 4));
        }
        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);
    }
}

