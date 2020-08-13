package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.dao.model.Location;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * 示例Controller
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@RestController
@RequestMapping("/location")
@Api(tags = "Location 地点表")
public class LocationController extends GenericController<Location,String> {

}
