package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2LinkappAuthDoRequest;

/**
 * 商户公域授权 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2LinkappAuthDoRequest.class)
public class V2LinkappAuthDoRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2LinkappAuthDoRequest request = new V2LinkappAuthDoRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000107203801");
        // 平台类型
        request.setPlatformType("21");
        // 协议地址
        request.setContractUrl("https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/spin/files/斗拱增值业务服务协议 V1.020231120.docx");
        // 签约商户名称
        request.setContractMerName("于云飞");
        // 签约时间
        request.setContractTime("1744008692000");
        // 登录用手机号第一次登录有需要手机验证码的情况;（需要授权手机安装一个转发短信的应用）
        // request.setPhoneNumber("test");
        // 商户类型商户类型：0个人店 1企业 2个体工商户 3其他(目前固定填3即可)
        // request.setMerchantType("test");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 回调地址
        // extendInfoMap.put("callback_url", "");
        // 
        // extendInfoMap.put("以下仅RPA授权输入", "");
        // 登录账号名称
        // extendInfoMap.put("account_name", "");
        // 登录账号密码
        // extendInfoMap.put("account_password", "");
        // 门店名称
        // extendInfoMap.put("shop_name", "");
        // 管理员手机号
        // extendInfoMap.put("admin_phone_num", "");
        return extendInfoMap;
    }

}
