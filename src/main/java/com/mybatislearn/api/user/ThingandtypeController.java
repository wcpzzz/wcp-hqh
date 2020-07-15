package com.mybatislearn.api.user;

import com.mybatislearn.api.BaseController;
import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.dao.model.Thingandtype;
import com.mybatislearn.service.GenericService;
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
@RequestMapping("/thingandtype")
@Api(tags = "Thingandtype 物品&种类关联表")
public class ThingandtypeController extends BaseController {

    @Autowired
    private GenericService<Thingandtype,Integer> genericService;

    /**
     * 创建
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    @PostMapping("/create")
    @ApiOperation("创建")
    public ApiResponse<Thingandtype> create(@RequestBody Thingandtype req) {
        return ApiResponse.success(genericService.create(req));
    }

    /**
     * 通过id查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询")
    public ApiResponse<Thingandtype> finById(@PathVariable Integer id) {
        return ApiResponse.success(genericService.findById(id));
    }

    /**
     * 分页查询
     * @author Caesar Liu
     * @date 2020-06-27 14:31
     */
    @PostMapping("/page")
    @ApiOperation("分页查询")
    public ApiResponse findPage (@RequestBody PageWrap<Thingandtype> pageWrap) {
        return ApiResponse.success(genericService.findPage(pageWrap));
    }

    /**
     * 根据ID修改
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    @PostMapping("/updateById")
    @ApiOperation("根据ID修改")
    public ApiResponse<Thingandtype> updateById(@RequestBody Thingandtype req) {
        genericService.updateById(req);
        return ApiResponse.success(null);
    }

    /**
     * 根据ID删除
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    @GetMapping("/delete/{id}")
    @ApiOperation("根据ID删除")
    public ApiResponse delete(@PathVariable Integer id) {
        genericService.deleteById(id);
        return ApiResponse.success(null);
    }
}
