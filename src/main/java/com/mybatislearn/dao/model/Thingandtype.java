package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thingandtype {
    @ApiModelProperty("")
    private String id;

    @ApiModelProperty("物品编号")
    private String thingId;

    @ApiModelProperty("物品种类编号")
    private String thingtypeId;

    @ApiModelProperty("修改时间")
    private Date modiTime;

    @ApiModelProperty("创建者")
    private String creater;

    @ApiModelProperty("管理者")
    private String master;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getThingId() {
        return thingId;
    }

    public void setThingId(String thingId) {
        this.thingId = thingId == null ? null : thingId.trim();
    }

    public String getThingtypeId() {
        return thingtypeId;
    }

    public void setThingtypeId(String thingtypeId) {
        this.thingtypeId = thingtypeId == null ? null : thingtypeId.trim();
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
