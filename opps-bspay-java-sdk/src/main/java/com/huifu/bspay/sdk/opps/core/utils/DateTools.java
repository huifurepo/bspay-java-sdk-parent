package com.huifu.bspay.sdk.opps.core.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description: 日期格式工具类
 * @author: xianlong.shen
 * @date:2021年6月24日下午4:30:22 
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DateTools {

    public static final String DATE_TIME_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_YYYYMMDD = "yyyyMMdd";
    public static final String HHMMSS = "HHmmss";
    private static final String DATE_TIME_YYYYMMDDHHMMSSSSS ="yyyyMMddHHmmssSSS";

    public final static String LONG_OTHER_FORMAT = "yyyy/MM/dd HH:mm:ss";
    
    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String HHmmss = "HHmmss";

    private static final DateTimeFormatter DATE_TIME_YYYYMMDDHHMMSSSSS_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_YYYYMMDDHHMMSSSSS);
    private static final DateTimeFormatter DATE_TIME_YYYYMMDDHHMMSS_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_YYYYMMDDHHMMSS);
    private static final DateTimeFormatter DATE_YYYYMMDD_FORMATTER = DateTimeFormatter.ofPattern(DATE_YYYYMMDD);
    private static final DateTimeFormatter YYMM_FORMATTER = DateTimeFormatter.ofPattern(HHMMSS);


    /**
     * 获取当前日期时间
     */
    public static String getCurrentDateTimeYYYYMMDDHHMMSS() {
        return DATE_TIME_YYYYMMDDHHMMSS_FORMATTER.format(LocalDateTime.now());
    }

    /**
     * 获取当前日期时间到毫秒级
     */
    public static String getCurrentDateTimeYYYYMMDDHHMMSSSSS() {
        return DATE_TIME_YYYYMMDDHHMMSSSSS_FORMATTER.format(LocalDateTime.now());
    }

    public static String getHHMMSS(){
        return YYMM_FORMATTER.format(LocalDateTime.now());
    }

    /**
     * 获取当前日期
     */
    public static String getCurrentDateYYYYMMDD() {
        return DATE_YYYYMMDD_FORMATTER.format(LocalDateTime.now());
    }

    public static boolean checkDateYYYYMMDD(String dateStr) {
        try {
            DATE_YYYYMMDD_FORMATTER.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static ThreadLocal<SimpleDateFormat> ACCURATE_OTHER_DATEYYYYMMDDHHMMSS = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(LONG_OTHER_FORMAT);
        }
    };
    
    /**
     * @return
     */
    public static String getOtherCurDateYYYYMMDD(Date date) {
        return ACCURATE_OTHER_DATEYYYYMMDDHHMMSS.get().format(date);
    }

    public static Date fromDateStringyyyyMMdd(String dateString) {
        try {
            return Date.from(ZonedDateTime.parse(dateString, DATE_YYYYMMDD_FORMATTER).toInstant());
        } catch (Exception e) {
            return null;
        }
    }

    public static Date fromDateStringyyyyMMddHHMMSS(String dateString) {
        try {
            return Date.from(ZonedDateTime.parse(dateString, DATE_TIME_YYYYMMDDHHMMSS_FORMATTER).toInstant());
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 将字符串转换为日期的类型，yyyyMMddHHmmss；支持多并发
     * @param date
     * @return
     */
    public static String formatYYYYMMDDHHSS(Date date) {
        SimpleDateFormat sf = new SimpleDateFormat(yyyyMMddHHmmss);
        try {
            if (date != null) {
                return sf.format(date);
            }else {
                return null;
            }
        } catch (Exception e) {
           return null;
        }
    }

    /**
     * 将字符串转换为日期的类型，yyyyMMddHHmmss；支持多并发
     * @param date
     */
    public static String formatYYYYMMDD(Date date) {
        SimpleDateFormat sf = new SimpleDateFormat(yyyyMMdd);
        try {
            if (date != null) {
                return sf.format(date);
            }else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 将Date转换成formatStr格式的字符串
     * @param date
     * @param formatStr
     */
    public static String dateToDateString(Date date, String formatStr) {
        if (date == null) {
            return null;
        }
        DateFormat df = getDateFormat(formatStr);
        return df.format(date);
    }

    public static SimpleDateFormat getDateFormat(final String formatStr) {
        return new SimpleDateFormat(formatStr);
    }
    
}
