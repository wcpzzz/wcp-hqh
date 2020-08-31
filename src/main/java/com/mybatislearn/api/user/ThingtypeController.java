package com.mybatislearn.api.user;

import com.mybatislearn.api.GenericController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.service.WcpLocationService;
import com.mybatislearn.service.WcpThingtypeService;
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
@RequestMapping("/thingtype")
@Api(tags = "Thingtype 物品种类表")
public class ThingtypeController extends GenericController<Thingtype,String> {
    @Autowired
    private WcpThingtypeService<Thingtype> wcpThingtypeService;
    @PostMapping("/findListLocationWithUser")
    @ApiOperation("连user表查物品种类")
    public ApiResponse<Thingtype> findListLocationWithUser(@RequestBody Thingtype req) {
        //可以在这个位置写一个传输到前端用的类
        if(wcpThingtypeService.findListThingtypeWithUser (req)!=null){
            return ApiResponse.success(wcpThingtypeService.findListThingtypeWithUser(req));
        }else {
            return ApiResponse.failed ("登陆失败");
        }
    }
}
