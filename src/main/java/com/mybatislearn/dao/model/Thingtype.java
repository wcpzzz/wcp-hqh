package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Thingtype {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("类型名称")
    private String thingtypeName;

    @ApiModelProperty("修改时间")
    private Date modiTime;

    @ApiModelProperty("创建者")
    private String creater;

    @ApiModelProperty("管理员")
    private String master;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThingtypeName() {
        return thingtypeName;
    }

    public void setThingtypeName(String thingtypeName) {
        this.thingtypeName = thingtypeName == null ? null : thingtypeName.trim();
    }

    public Date getModiTime() {
        return modiTime;
    }

    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }
}
