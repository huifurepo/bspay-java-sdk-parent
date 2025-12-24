package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceOpenRequest;

/**
 * 发票开具 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceOpenRequest.class)
public class V2InvoiceOpenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceOpenRequest request = new V2InvoiceOpenRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号huifu_id与ext_mer_id二选一必填，汇付商户号优先；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
        request.setHuifuId("6666000107430944");
        // 外部商户号&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
        request.setExtMerId("");
        // 渠道号汇付商户号为空时，必传；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812124&lt;/font&gt;
        // request.setChannelId("test");
        // 发票类型
        request.setIvcType("1");
        // 开票类型
        request.setOpenType("0");
        // 购方单位名称
        request.setBuyerName("张三");
        // 含税合计金额(元)
        request.setOrderAmt("70.00");
        // 冲红原因open_type&#x3D;1时必填01：开票有误02：销货退回03：服务终止04：销售转让
        // request.setRedApplyReason("test");
        // 冲红申请来源open_type&#x3D;1时必填01：销方02：购方
        // request.setRedApplySource("test");
        // 原发票代码openType&#x3D;1时必填；参见[发票右上角](https://paas.huifu.com/open/doc/api/#/fp/api_fp_yanglitu.md)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：144032209110&lt;/font&gt;
        request.setOriIvcCode("90222082");
        // 原发票号码openType&#x3D;1时必填；参见[发票右上角](https://paas.huifu.com/open/doc/api/#/fp/api_fp_yanglitu.md)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20685767&lt;/font&gt;
        request.setOriIvcNumber("150000020026");
        // 开票商品信息
        request.setGoodsInfos(get0bb8a84aD18741808dfaC418a6f7fb13());
        // 不动产销售特殊字段specialFlag为05时，必填；jsonArray格式
        // request.setEstateSales(getDfe47e85A31c40f495b197799cdf3f49());
        // 不动产租赁特殊字段specialFlag为16时，必填；jsonArray格式
        // request.setEstateLease(get66c667e4A22b4c89A5466ae4d3523ec9());

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
        // 税控盘编号
        extendInfoMap.put("tax_device_id", "661919694739");
        // 购方单位识别号
        extendInfoMap.put("buyer_no", "");
        // 购方单位地址
        extendInfoMap.put("buyer_address", "");
        // 购方单位电话
        extendInfoMap.put("buyer_tel", "");
        // 购方开户行名称
        extendInfoMap.put("buyer_bank_name", "");
        // 购方银行账号
        extendInfoMap.put("buyer_acct_no", "");
        // 购方企业类型
        extendInfoMap.put("buyer_ent_type", "");
        // 收票人手机号
        extendInfoMap.put("rec_ivc_phone", "");
        // 收票人邮件
        extendInfoMap.put("rec_ivc_email", "test@126.com");
        // 备注
        extendInfoMap.put("resv", "备注");
        // 特殊票种标识
        extendInfoMap.put("special_flag", "00");
        // 红字信息表编号
        extendInfoMap.put("red_info_number", "");
        // 开票人信息
        extendInfoMap.put("payer_info", getCbaf37c51ae9459581cfBe03d4721011());
        // 开票结果异步通知地址
        extendInfoMap.put("callback_url", "virgo://http://192.168.85.157:30031/sspm/testVirgo");
        // 强制开票标识
        extendInfoMap.put("buyer_info_confirm", "");
        return extendInfoMap;
    }

    private static String get0bb8a84aD18741808dfaC418a6f7fb13() {
        JSONObject dto = new JSONObject();
        // 发票行性质
        dto.put("ivc_nature", "0");
        // 商品序号ivc_type&#x3D;1 红票必填，要与开具的蓝票商品一致；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：备注&lt;/font&gt;
        dto.put("goods_serial_num", "");
        // 商品id二选一必填，税收分类编码优先；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
        dto.put("goods_id", "");
        // 商品税收分类编码参考[商品编码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/fp/%E7%94%B5%E5%AD%90%E5%8F%91%E7%A5%A8%E5%95%86%E5%93%81%E7%BC%96%E7%A0%81.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1010101090000000000&lt;/font&gt;
        dto.put("goods_code", "6010000000000000000");
        // 商品名称goodsCode不为空时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
        dto.put("goods_name", "预付卡");
        // 税率goodsCode不为空时必填，最多三位小数；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.130&lt;/font&gt;
        dto.put("tax_rate", "0.03");
        // 含税标识
        dto.put("is_price_con_tax", "1");
        // 金额(元)
        dto.put("trans_amt", "70.00");
        // 规格型号
        dto.put("goods_model", "");
        // 计量单位
        dto.put("goods_unit", "");
        // 优惠政策标识
        dto.put("preferential_flag", "0");
        // 零税率标示
        dto.put("zero_tax_rate_flag", "");
        // 增值税特殊管理
        dto.put("add_tax_spec_manage", "");
        // 商品数量
        dto.put("goods_count", "7");
        // 单价
        dto.put("goods_price", "10");
        // 折扣金额(元)
        dto.put("sale_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getCbaf37c51ae9459581cfBe03d4721011() {
        JSONObject dto = new JSONObject();
        // 开票人
        dto.put("payer_name", "开票人");
        // 收款人
        dto.put("payee", "收款人");
        // 复核人
        dto.put("reviewer", "复核");

        return dto.toJSONString();
    }

    private static String getDfe47e85A31c40f495b197799cdf3f49() {
        JSONObject dto = new JSONObject();
        // 不动产地址
        // dto.put("addr", "test");
        // 不动产详细地址
        // dto.put("detail_addr", "test");
        // 跨地（市）标志
        // dto.put("area_flag", "test");
        // 土地增值税项目编号
        // dto.put("tax_item_no", "test");
        // 不动产单元代码/网签合同备案编号
        // dto.put("record_no", "test");
        // 核定计税价格
        // dto.put("total_amt", "test");
        // 实际成交含税金额
        // dto.put("deal_amt", "test");
        // 房屋产权证书/不动产产权号
        // dto.put("estate_no", "test");
        // 不动产单位
        // dto.put("unit", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get66c667e4A22b4c89A5466ae4d3523ec9() {
        JSONObject dto = new JSONObject();
        // 不动产地址
        // dto.put("addr", "test");
        // 不动产详细地址
        // dto.put("detail_addr", "test");
        // 跨地（市）标志
        // dto.put("area_flag", "test");
        // 租赁日期起
        // dto.put("start_date", "test");
        // 租赁日期止
        // dto.put("end_date", "test");
        // 房屋产权证书/不动产产权号
        // dto.put("estate_no", "test");
        // 不动产单位
        // dto.put("unit", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
