package com.mybatislearn.api.user;
import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.utils.jwtmodel.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09*/


@RestController
@RequestMapping("/user")
@Api(tags = "User 用户表")
public class UserController extends GenericController<User, String> {
    @Autowired
    private LoginService<User> loginService;
    @PostMapping("/login")
    @ApiOperation("登录")
    public ApiResponse<Token> login(@RequestBody User req) {
        //可以在这个位置写一个传输到前端用的类
        if(loginService.login(req)!=null){
            return ApiResponse.success(null);
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
}
