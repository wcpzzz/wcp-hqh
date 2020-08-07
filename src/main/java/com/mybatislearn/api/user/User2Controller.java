package com.mybatislearn.api.user;
import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.model.User2;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.utils.jwtmodel.JwtInfo;
import com.mybatislearn.utils.jwtmodel.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/user2")
@Api(tags = "User2 用户表")
public class User2Controller extends GenericController<User2, String> {
    @Autowired
    private LoginService<User2> loginService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public ApiResponse<Token> login(@RequestBody User2 req) {
        return ApiResponse.success(loginService.login(req));
    }
}
