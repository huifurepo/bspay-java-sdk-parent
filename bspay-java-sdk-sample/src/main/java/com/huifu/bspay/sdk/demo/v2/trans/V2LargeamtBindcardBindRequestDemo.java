package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2LargeamtBindcardBindRequest;

/**
 * 银行大额支付绑卡 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2LargeamtBindcardBindRequest.class)
public class V2LargeamtBindcardBindRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2LargeamtBindcardBindRequest request = new V2LargeamtBindcardBindRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108312997");
        // 卡类型
        request.setCardType("1");
        // 银行账户名
        request.setCardName("许溪证");
        // 银行卡号密文
        request.setCardNo("GCMghaHLsWffNmBl/uuvVnv+kzwvBSLaZR+AsldnabAMzjPUzw4SMe2DX8IvVTM/Qb/tbiQwayeQ+TwkeSyQ0IB6oy/BNgM3rl7wZsdTzKbyigyGQvtOYsauk3IUuiJ8ptJ1k0C4Ysd5Z4+6ApLmOZhAem1pqu+DUk8EpKMj37RDgk3zWgVIf1wX9nBaSN1IGIoVjmweg8/r/UVWqCKoYrEWHxO1R0elZM9+hXTwXEKHFc2L2yossgDGjJDKuykaN0DzVunz1uQbxuvg4lMCmycSRjlQ1MCsIzqs4oiVNW3PCqAwoFkdRKL879e5/EsvohJJNVuX6YOeefFdJOC8Ug==");
        // 银行编码
        request.setBankCode("");

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
        // 账户号
        extendInfoMap.put("acct_id", "C02730634");
        // 银行卡绑定身份证
        extendInfoMap.put("cert_no", "k05wtsAi+WSv8rdRaj24nOGQetL4L8k5VFRGPdljb1O/5pOJYe4o3ofwiKNjaVyAwvGFWIqMNEu0GU1gcq+UDmnabOROcneJVNGu+XMy5J9I55OqBDOC5lIiiuSWQux7TlaDCZT7ACpYHjRI2r3bzOASgzPXebjYLllnuEg2kxYpGqJBe8jsjaTpAzoEB1Yoy6I0sAn4xxl8IjmGu5AHEA/drWyrAIT0GsEhmeR6wkJK3iCjShqIQ317BkNBzXsdt8dGZLF4M/7iwiQXaVP2KLWKtX+gn2oI19ckTTiFXnvuNtNPJEUEayTbsAODHKvo5wsYLUdbnO2UFJ6wlE3rOQ==");
        // 联行号
        extendInfoMap.put("branch_code", "105290071051");
        // 银行所在省
        extendInfoMap.put("prov_id", "130000");
        // 银行所在市
        extendInfoMap.put("area_id", "130300");
        // 手机号
        extendInfoMap.put("mobile_no", "dFw39mqjcPyZJk5ukKiH5oL+LyJLdJ2DfPgXcOCCgYfsUuCcOJLPnBc6f0nybPDBnfgLCcK31wG5TLFi97EttpBsrQVI6kEWMrxUAAcIehSMuWEBBuGG8QnaayE0tZa2gSgQZgFltCrkgfQ08N6TwLmvZEJ3z+gudsIPRaMXAgxMgnyH6xjuFbdOWJKfgcTQxpIirIQg0bWPpBPnO6HizB3z435qeep7WVCRK7c+tvYxjLRm7jDEeUCd9c0yZ4eKWOt1vLini6kqAwXuCTXa10z1NEnGbFlBrOK5/R5ZK977BmuAD7ZLuHU6T/j2Ca1nG6JOJwXT827CVo/sU7osjQ==");
        // 补充资质材料列表
        extendInfoMap.put("file_list", getFileList());
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件jfileID
        // dto.put("file_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
