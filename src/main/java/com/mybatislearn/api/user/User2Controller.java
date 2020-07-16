package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.User2;
import io.swagger.annotations.Api;
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

}
