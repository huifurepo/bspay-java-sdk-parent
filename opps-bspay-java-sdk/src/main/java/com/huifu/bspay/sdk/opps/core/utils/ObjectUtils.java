package com.huifu.bspay.sdk.opps.core.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: TODO
 * @Author: xx
 * @Date 2021/6/22 21:42
 */
public class ObjectUtils {
    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    /**
     * 驼峰转下划线
     *
     * @param str
     * @return
     */
    public static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /**
     * 对象转map
     *
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        List<Field> fieldList = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        if (clazz != null) {
            fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
            //clazz = clazz.getSuperclass();//找到所有父类的属性
            //fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
        }
        for (Field field : fieldList) {
            field.setAccessible(true);
            Object value = field.get(obj);
            if (null != value) {
                //驼峰转下划线
                map.put(humpToLine(field.getName()), value);
            }
        }
        return map;
    }
}
