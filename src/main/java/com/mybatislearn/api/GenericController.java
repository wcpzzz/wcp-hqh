package com.mybatislearn.api;

import com.mybatislearn.core.model.ApiResponse;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.service.GenericService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public abstract class GenericController<Record, Id> extends BaseController {

    @Autowired
    private GenericService<Record, Id> genericService;

    @PostMapping("/create")
    @ApiOperation("创建")
    public ApiResponse<Record> create(@RequestBody Record req) {
        return ApiResponse.success(genericService.create(req));
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询")
    public ApiResponse<Record> findById(@PathVariable Id id) {
        return ApiResponse.success(genericService.findById(id));
    }

    @PostMapping("/findOne")
    @ApiOperation("根据类查询单个")
    public ApiResponse<Record> findOne(@RequestBody Record req) {
        return ApiResponse.success(genericService.findOne(req));
    }
    @PostMapping("/findList")
    @ApiOperation("根据类查询列表")
    public ApiResponse<Record> findOList(@RequestBody Record req) {
        return ApiResponse.success(genericService.findList(req));
    }
    @PostMapping("/page")
    @ApiOperation("分页查询")
    public ApiResponse findPage (@RequestBody PageWrap<Record> pageWrap) {
        return ApiResponse.success(genericService.findPage(pageWrap));
    }

    @PostMapping("/updateById")
    @ApiOperation("根据ID修改")
    public ApiResponse<Record> updateById(@RequestBody Record req) {
        genericService.updateById(req);
        return ApiResponse.success(null);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation("根据ID删除")
    public ApiResponse delete(@PathVariable Id id) {
        genericService.deleteById(id);
        return ApiResponse.success(null);
    }
}
