package com.huifu.bspay.sdk.opps.core.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/***
 * @Description: 随机生成数工具类
 * @author: xianlong.shen
 * @date:2021年6月24日下午5:13:48 
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class RandomTools {
	
	/***
	 * @Description: 按照位数获取 小字符型 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomSmallLetterData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.LETTER);
	}
	
	/***
	 * @Description: 按照位数获取 大写字符型 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomBigLetterData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.CAPITAL);
	}
	
	/***
	 * @Description: 按照位数获取纯数字字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomNumberData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.NUMBER);
	}
	
	/***
	 * @Description: 按照位数获取 大+小字符 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomBigSmallLetterData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.LETTER_CAPITAL);
	}
	
	/***
	 * @Description: 按照位数获取小字符+数字型 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomSmallLetterNumberData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.LETTER_NUMBER);
	}
	
	/***
	 * @Description: 按照位数获取 大写字符+数字 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomBigLetterNumberData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.CAPITAL_NUMBER);
	}
	
	/***
	 * @Description: 按照位数获取 大+小字符+数字 字符串
	 * @param num 位数
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
	public static String getRandomBigSmallLetterNumberData(int num) {
		return RandomTools.getRandom(num, RandomTools.TYPE.LETTER_CAPITAL_NUMBER);
	}
	
	/**
     * 随机产生类型枚举
     */
    private static enum TYPE {
        /**小字符型*/
        LETTER,
        /**大写字符型*/
        CAPITAL,
        /**数字型*/
        NUMBER,
        /**大+小字符 型*/
        LETTER_CAPITAL,
        /**小字符+数字 型*/
        LETTER_NUMBER,
        /**大写字符+数字*/
        CAPITAL_NUMBER,
        /**大+小字符+数字 型*/
        LETTER_CAPITAL_NUMBER,
    }
    
    private static String[] number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
    
    private static String[] lowercase = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    private static String[] capital = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    /**
     * 静态随机数
     */
    private static Random random = new Random();
    
    /***
	 * @Description: 获取随机组合码
     * @param num 位数
     * @param type 类型
     * <br>小写字符型 LETTER,
     * <br>大写字符型 CAPITAL,
     * <br>数字型 NUMBER,
     * <br>大+小字符型 LETTER_CAPITAL,
     * <br>小字符+数字 型 LETTER_NUMBER,
     * <br>大字符+数字 型 CAPITAL_NUMBER,
     * <br>大+小字符+数字 型 LETTER_CAPITAL_NUMBER,
	 * @return String 返回字符串
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午5:04:07
	 */
    private static String getRandom(int num, TYPE type) {
        ArrayList<String> temp = new ArrayList<String>();
        StringBuffer code = new StringBuffer();
        switch (type) {
        case LETTER:
            temp.addAll(Arrays.asList(lowercase));
            break;
        case CAPITAL:
            temp.addAll(Arrays.asList(capital));
            break;
        case NUMBER:
            temp.addAll(Arrays.asList(number));
            break;
        case LETTER_CAPITAL:
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(capital));
            break;
        case LETTER_NUMBER:
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(number));
            break;
        case CAPITAL_NUMBER:
            temp.addAll(Arrays.asList(capital));
            temp.addAll(Arrays.asList(number));
            break;
        case LETTER_CAPITAL_NUMBER:
            temp.addAll(Arrays.asList(lowercase));
            temp.addAll(Arrays.asList(capital));
            temp.addAll(Arrays.asList(number));
            break;
        }
        for (int i = 0; i < num; i++) {
            code.append(temp.get(random.nextInt(temp.size())));
        }
        return code.toString();
    }
    
}
