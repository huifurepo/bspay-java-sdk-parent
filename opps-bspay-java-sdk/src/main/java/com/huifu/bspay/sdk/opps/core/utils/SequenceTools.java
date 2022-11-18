package com.huifu.bspay.sdk.opps.core.utils;

import org.apache.commons.lang3.StringUtils;

/***
 * @Description: 流水号生产工具【该工具类只供demo测试用例中使用，不建议投产使用】
 * @author: xianlong.shen
 * @date:2021年6月24日下午5:21:59 
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SequenceTools {
	
	/***
	 * @Description: 生成固定40位系统订单号
	 * @param currentDateAndTime 获取当前日期时间到毫秒级
	 * @return String 流水号
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午4:43:23
	 */
    public static String getReqSeqId32() {
        String randomSmallLetterNumberId = RandomTools.getRandomSmallLetterNumberData(14);
        return new StringBuilder(DateTools.getCurrentDateTimeYYYYMMDDHHMMSSSSS()).append(StringUtils.leftPad(randomSmallLetterNumberId, 14, "0")).toString();
    }
    
    /***
	 * @Description: 生成固定40位系统订单号
	 * @param currentDateAndTime 获取当前日期时间到毫秒级
	 * @return String 流水号
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午4:43:23
	 */
    public static String getReqSeqId40() {
        String randomSmallLetterNumberId = RandomTools.getRandomSmallLetterNumberData(22);
        return new StringBuilder(DateTools.getCurrentDateTimeYYYYMMDDHHMMSSSSS()).append(StringUtils.leftPad(randomSmallLetterNumberId, 22, "0")).toString();
    }
    
    /***
	 * @Description: 生成固定64位系统订单号
	 * @param currentDateAndTime 获取当前日期时间到毫秒级
	 * @return String 流水号
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午4:43:23
	 */
    public static String getReqSeqId(String currentDateAndTime) {
        String randomSmallLetterNumberId = RandomTools.getRandomSmallLetterNumberData(52);
        return new StringBuilder(currentDateAndTime).append(StringUtils.leftPad(randomSmallLetterNumberId, 52, "0")).toString();
    }
    
    /***
     * @Description: 生成指定位数流水号(18位+位数)
     * @param currentDateAndTime 时间毫秒级18位+位数
     * @param number 位数
     * @return String
     * @author: xianlong.shen
     * @date: 2021年6月24日下午4:45:10
     */
    public static String getReqSeqId(String currentDateAndTime, int number) {
    	String randomSmallLetterNumberId = RandomTools.getRandomSmallLetterNumberData(number);
        return new StringBuilder(currentDateAndTime).append(StringUtils.leftPad(randomSmallLetterNumberId, number, "0")).toString();
    } 
    
}
