package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.Thingandtype;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/thingandtype")
@Api(tags = "Thingandtype 物品&种类关联表")
public class ThingandtypeController extends GenericController<Thingandtype,Integer> {

}
