package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.dto.ThingThingtype;
import com.mybatislearn.dao.dto.ThingUser;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.service.WcpThingService;
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
@RequestMapping("/thing")
@Api(tags = "Thing 物品表")
public class ThingController extends GenericController<Thing,String> {
    @Autowired
    private WcpThingService<Thing> wcpThingService;

    @PostMapping("/findListWithUser2")
    @ApiOperation("连表查")
    public ApiResponse<ThingUser> findListWithUser2(@RequestBody Thing req) {
        //可以在这个位置写一个传输到前端用的类
        if(wcpThingService.findThingWithUser (req)!=null){
            return ApiResponse.success(wcpThingService.findThingWithUser(req));
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
    @PostMapping("/findListWithThingtype")
    @ApiOperation("多对多")
    public ApiResponse<ThingThingtype> findListWithThingtype(@RequestBody Thing req) {
        //可以在这个位置写一个传输到前端用的类
        if(wcpThingService.findThingWithThingtype (req)!=null){
            return ApiResponse.success(wcpThingService.findThingWithThingtype(req));
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
}
