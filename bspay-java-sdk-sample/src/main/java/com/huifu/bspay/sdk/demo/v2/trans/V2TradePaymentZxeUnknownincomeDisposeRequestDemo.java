package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentZxeUnknownincomeDisposeRequest;

/**
 * 不明来账处理 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentZxeUnknownincomeDisposeRequest.class)
public class V2TradePaymentZxeUnknownincomeDisposeRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentZxeUnknownincomeDisposeRequest request = new V2TradePaymentZxeUnknownincomeDisposeRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 银行侧交易流水号参照异步通知里的bank_serial_no；&lt;br/&gt;“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
        request.setBankSerialNo("FRSC202409252NEA000121452600000");
        // 来账银行账号需要密文传输，使用汇付RSA公钥加密(加密前64位，加密后最长2048位），参见[参考文档](https://paas.huifu.com/open/doc/guide/#/api_jiami_jiemi)；示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
        // request.setPayAcct("test");
        // 来账账户名称“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
        // request.setPayAcctName("test");
        // 交易金额“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
        // request.setTransAmt("test");
        // 交易日期“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
        // request.setTransDate("test");
        // 操作类型
        request.setOperateType("0");

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
        // 交易时间
        // extendInfoMap.put("trans_time", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://mock.uutool.cn/fat69kri74k");
        return extendInfoMap;
    }

}
