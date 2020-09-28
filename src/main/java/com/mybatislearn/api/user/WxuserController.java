package com.mybatislearn.api.user;

import afu.org.checkerframework.checker.oigj.qual.O;
import com.mybatislearn.api.GenericController;
import com.mybatislearn.config.WxMaConfiguration;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.Wxuser;
import com.mybatislearn.service.GenericService;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.service.WxuserService;
import com.mybatislearn.service.WxuserService;
import com.mybatislearn.service.genericimpl.WxuserServiceImpl;
import com.mybatislearn.utils.hqhutils.JsonUtils;
import com.mybatislearn.utils.jwtmodel.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09*/


@RestController
@RequestMapping("/wxuser/{appid}")
@Api(tags = "Wxuser 用户表")
public class WxuserController extends GenericController<Wxuser, String> {
    @Autowired
    private WxuserService<Wxuser> wxuserService;
    @Autowired
    private WxuserServiceImpl wxuserServiceImpl;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/signin")
    @ApiOperation("用户登录")
    public ApiResponse<Token> signin(@RequestBody Wxuser req) {
        //可以在这个位置写一个传输到前端用的类
        if(wxuserService.signin(req)!=null){
            return ApiResponse.success(null);
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }

    @PostMapping("/signup")
    @ApiOperation("创建用户")
    public ApiResponse<Wxuser> signup(@RequestBody Wxuser req) {
        // 可能返回ID，也可能是错误信息
        String msg = wxuserServiceImpl.create(req);
        switch (msg) {
            case "wxuser.set_name_unique":
                return ApiResponse.failed("用户名已存在");
            case "wxuser.set_phone_unique":
                return ApiResponse.failed("手机号已存在");
            default:
                return ApiResponse.success(msg);
        }
    }

    /**
     * 登陆接口
     */
    @GetMapping("/login")
    @ApiOperation("登陆接口")
    // rawData: 不包括敏感信息的原始数据字符串，用于计算签名
    // signature: 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，详见 用户数据的签名验证和加解密
    // iv: 加密算法的初始向量，详见 用户数据的签名验证和加解密
    public ApiResponse<Token> login(@PathVariable String appid, String code, String user_signature, String user_rawData,
                        String user_encryptedData, String uiv, String phone_signature, String phone_rawData,
                        String phone_encryptedData, String piv) {
        if (StringUtils.isBlank(code)) {
//            return "empty js-code";
            return ApiResponse.failed ("登陆失败, empty js-code");
        }

        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        try {
            WxMaJscode2SessionResult session = wxService.getUserService().getSessionInfo(code);
            this.logger.info(session.getSessionKey());
            this.logger.info(session.getOpenid());
            //TODO 可以增加自己的逻辑，关联业务相关数据
            String sessionKey = session.getSessionKey();
            // 获取信息
            String userInfo = info(appid, sessionKey, user_signature, user_rawData, user_encryptedData, uiv);
            String phone_number = phone(appid, sessionKey, phone_signature, phone_rawData, phone_encryptedData, piv);
            // TODO 存信息
            System.out.println(userInfo);
            System.out.println(phone_number);

            if(wxuserService.signin(userInfo)!=null){
                return ApiResponse.success(null);
            }else {
                return ApiResponse.failed ("登陆失败");
            }
//            return JsonUtils.toJson(session);
        } catch (WxErrorException e) {
            this.logger.error(e.getMessage(), e);
//            return e.toString();
            return ApiResponse.failed ("登陆异常");
        }
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @GetMapping("/info")
    @ApiOperation("获取用户信息接口")
    public String info(@PathVariable String appid, String sessionKey,
                       String signature, String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return "user check failed";
        }

        // 解密用户信息
        WxMaUserInfo userInfo = wxService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        return JsonUtils.toJson(userInfo);
    }

    /**
     * <pre>
     * 获取用户绑定手机号信息
     * </pre>
     */
    @GetMapping("/phone")
    @ApiOperation("获取用户绑定手机号信息")
    public String phone(@PathVariable String appid, String sessionKey, String signature,
                        String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return "user check failed";
        }

        // 解密
        WxMaPhoneNumberInfo phoneNoInfo = wxService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);

        return JsonUtils.toJson(phoneNoInfo);
    }

}
