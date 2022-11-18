/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.utils;

import java.util.Collection;

/***
 * @Description: 工具类
 * @author: xianlong.shen
 * @date:2021年6月24日下午4:24:09 
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StringUtil {
	
	/***
	 * @Description: 判断对象是否为空
	 * @param str 验证数据
	 * @author: xianlong.shen
	 * @date: 2021年6月24日下午4:27:16
	 */
    public static boolean isEmpty(Object str) {
        return (str == null) || ("".equals(str));
    }
    
    /***
     * @Description: 判断是否为空
     * @param collection
     * @author: xianlong.shen
     * @date: 2021年6月24日下午4:37:02
     */
    @SuppressWarnings("rawtypes")
	public static boolean isEmpty(Collection collection) {
        return (collection == null) || (collection.isEmpty());
    }
    
}
