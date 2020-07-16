package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.Thingandlocation;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/thingandlocation")
@Api(tags = "Thingandlocation  物品&地点关联表")
public class ThingandlocationController extends GenericController<Thingandlocation,Integer> {

}
