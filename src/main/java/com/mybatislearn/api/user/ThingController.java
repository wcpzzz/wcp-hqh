package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.Thing;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/thing")
@Api(tags = "Thing 物品表")
public class ThingController extends GenericController<Thing,String> {

}
