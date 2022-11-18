package com.huifu.bspay.sdk.demo.v2.trans.async;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:交易异步消息处理demo
 * 接收异步消息需要部署http服务，并将服务的url在webhook注册订阅事件
 * demo使用spring mvc开发http服务端
 **/
@RestController
public class AsyncWebHookMessageHandDemo {

    /**
     * 接收异步消息的服务
     * @param messageBody 交易服务推送的消息体
     * @return 如返回的http_state_code非200，则推送方认为推送失败
     */
    @RequestMapping("/asyncMessageHand")
    public String print(@RequestBody String messageBody) {
        JSONObject jsonObject = JSONObject.parseObject(messageBody);
        // 获取事件类型
        String eventDefineNo = jsonObject.getString("eventDefineNo");
        // 对不同的事件类型做业务处理 注：demo仅以三个支付事件类型作为参考，具体全部事件类型请参考webhook文档
        switch (eventDefineNo) {
            case "pay.ali_js" :
                // 支付宝JS 相关业务处理
                break;
            case "pay.ali_qr" :
                // 支付宝正扫 相关业务处理
                break;
            case "pay.union_js" :
                // 银联JS支付 相关业务处理
                break;
            default:
                // 未知业务处理
        }
        return "ok";
    }

}
