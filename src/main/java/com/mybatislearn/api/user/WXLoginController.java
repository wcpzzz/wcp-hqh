package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.model.Wxlogin;
import com.mybatislearn.service.WxloginService;
import com.mybatislearn.utils.jwtmodel.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wx")
@Api(tags = "wx wx表")
public class WXLoginController extends GenericController<Wxlogin, String> {
    @Autowired
    private WxloginService<Wxlogin> wxloginService;
    @PostMapping("/login")
    @ApiOperation("登录login")
    public ApiResponse<Token> login(@RequestBody Wxlogin req) {
        //可以在这个位置写一个传输到前端用的类
        if(wxloginService.login(req)!=null){
            return ApiResponse.success(null);
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
}
