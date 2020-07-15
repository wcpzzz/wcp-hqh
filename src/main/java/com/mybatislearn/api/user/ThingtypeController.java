package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.Thingtype;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/thingtype")
@Api(tags = "Thingtype 物品种类表")
public class ThingtypeController extends GenericController<Thingtype,Integer> {

}
