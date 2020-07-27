package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Thingandtype {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("物品编号")
    private Integer thingId;

    @ApiModelProperty("物品种类编号")
    private Integer thingtypeId;

    @ApiModelProperty("修改时间")
    private Date modiTime;

    @ApiModelProperty("创建者")
    private String creater;

    @ApiModelProperty("管理者")
    private String master;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThingId() {
        return thingId;
    }

    public void setThingId(Integer thingId) {
        this.thingId = thingId;
    }

    public Integer getThingtypeId() {
        return thingtypeId;
    }

    public void setThingtypeId(Integer thingtypeId) {
        this.thingtypeId = thingtypeId;
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
