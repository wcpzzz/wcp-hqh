package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.dto.LocationUser;
import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.service.WcpLocationService;
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
@RequestMapping("/location")
@Api(tags = "Location 地点表")
public class LocationController extends GenericController<Location,String> {
    @Autowired
    private WcpLocationService<Location> wcpLocationService;
    @PostMapping("/findListLocationWithUser")
    @ApiOperation("连user表查地点")
    public ApiResponse<LocationUser> findListLocationWithUser(@RequestBody Location req) {
        //可以在这个位置写一个传输到前端用的类
        if(wcpLocationService.findListLocationWithUser (req)!=null){
            return ApiResponse.success(wcpLocationService.findListLocationWithUser(req));
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
}
