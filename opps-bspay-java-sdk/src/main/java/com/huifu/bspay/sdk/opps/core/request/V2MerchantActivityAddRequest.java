package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户活动报名
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantActivityAddRequest extends BaseRequest {

    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 营业执照图片调用[图片上传接口](http://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)获取jfile文件id；[示例图片](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/spin/imgs/%E8%90%A5%E4%B8%9A%E6%89%A7%E7%85%A7%E7%A4%BA%E4%BE%8B.png)参考&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;&lt;br/&gt;活动类型为支付宝谷雨活动时无需填写任何资料
     */
    @JSONField(name = "bl_photo")
    private String blPhoto;
    /**
     * 店内环境图片参加教育食堂、非校园餐饮、非盈利、停车缴费行业时必传；调用[图片上传接口](http://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)获取jfile文件id；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;&lt;br/&gt;活动类型为支付宝谷雨活动时无需填写任何资料
     */
    @JSONField(name = "dh_photo")
    private String dhPhoto;
    /**
     * 手续费类型
     */
    @JSONField(name = "fee_type")
    private String feeType;
    /**
     * 整体门面图片（门头照）参加教育食堂行业、非校园餐饮、非盈利、线下教培、公办医院、商业医疗时必传；调用[图片上传接口](http://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)获取jfile文件id；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;&lt;br/&gt;活动类型为支付宝谷雨活动时无需填写任何资料&lt;br/&gt;若为线下教培活动,[示例图片](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/spin/imgs/%E9%97%A8%E5%A4%B4%E7%85%A7%E7%A4%BA%E4%BE%8B.png)参考
     */
    @JSONField(name = "mm_photo")
    private String mmPhoto;
    /**
     * 收银台照片参加教育食堂行业、线下教培、公办医院时必传；调用[图片上传接口](http://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)获取jfile文件id；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;&lt;br/&gt;活动类型为支付宝谷雨活动时无需填写任何资料
     */
    @JSONField(name = "syt_photo")
    private String sytPhoto;
    /**
     * 支付通道
     */
    @JSONField(name = "pay_way")
    private String payWay;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_ACTIVITY_ADD;
    }

    public V2MerchantActivityAddRequest() {
    }

    public V2MerchantActivityAddRequest(String reqDate, String reqSeqId, String huifuId, String blPhoto, String dhPhoto, String feeType, String mmPhoto, String sytPhoto, String payWay) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.blPhoto = blPhoto;
        this.dhPhoto = dhPhoto;
        this.feeType = feeType;
        this.mmPhoto = mmPhoto;
        this.sytPhoto = sytPhoto;
        this.payWay = payWay;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getBlPhoto() {
        return blPhoto;
    }

    public void setBlPhoto(String blPhoto) {
        this.blPhoto = blPhoto;
    }

    public String getDhPhoto() {
        return dhPhoto;
    }

    public void setDhPhoto(String dhPhoto) {
        this.dhPhoto = dhPhoto;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getMmPhoto() {
        return mmPhoto;
    }

    public void setMmPhoto(String mmPhoto) {
        this.mmPhoto = mmPhoto;
    }

    public String getSytPhoto() {
        return sytPhoto;
    }

    public void setSytPhoto(String sytPhoto) {
        this.sytPhoto = sytPhoto;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

}
