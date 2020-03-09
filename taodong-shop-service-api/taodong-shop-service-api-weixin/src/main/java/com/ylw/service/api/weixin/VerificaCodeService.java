package com.ylw.service.api.weixin;

import com.alibaba.fastjson.JSONObject;
import com.ylw.common.web.core.entity.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description: 微信验证服务接口
 * create by: YangLinWei
 * create time: 2020/2/20 2:22 下午
 */
@Api(tags = "微信注册码验证码接口")
public interface VerificaCodeService {

    /**
     * 功能说明:根据手机号码验证码token是否正确
     *
     * @return
     */
    @ApiOperation(value = "根据手机号码验证码token是否正确")
    @PostMapping("/verificaWeixinCode")
    @ApiImplicitParams({
            // @ApiImplicitParam(paramType="header",name="name",dataType="String",required=true,value="用户的姓名",defaultValue="zhaojigang"),
            @ApiImplicitParam(paramType = "query", name = "phone", dataType = "String", required = true, value = "用户手机号码"),
            @ApiImplicitParam(paramType = "query", name = "weixinCode", dataType = "String", required = true, value = "微信注册码") })
    public BaseResponse<JSONObject> verificaWeixinCode(@RequestParam("phone") String phone,
                                                       @RequestParam("weixinCode") String weixinCode);
}