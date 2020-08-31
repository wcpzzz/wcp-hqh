package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thingandtype {
    @ApiModelProperty("")
    private String thingandtypeId;

    @ApiModelProperty("物品编号")
    private String thingandtypeThingId;

    @ApiModelProperty("物品种类编号")
    private String thingandtypeThingtypeId;

    @ApiModelProperty("修改时间")
    private Date thingandtypeModiTime;

    @ApiModelProperty("创建者")
    private String thingandtypeUserCreater;

    @ApiModelProperty("管理者")
    private String thingandtypeUserMaster;

    public String getThingandtypeId() {
        return thingandtypeId;
    }

    public void setThingandtypeId(String thingandtypeId) {
        this.thingandtypeId = thingandtypeId == null ? null : thingandtypeId.trim();
    }

    public String getThingandtypeThingId() {
        return thingandtypeThingId;
    }

    public void setThingandtypeThingId(String thingandtypeThingId) {
        this.thingandtypeThingId = thingandtypeThingId == null ? null : thingandtypeThingId.trim();
    }

    public String getThingandtypeThingtypeId() {
        return thingandtypeThingtypeId;
    }

    public void setThingandtypeThingtypeId(String thingandtypeThingtypeId) {
        this.thingandtypeThingtypeId = thingandtypeThingtypeId == null ? null : thingandtypeThingtypeId.trim();
    }

    public Date getThingandtypeModiTime() {
        return thingandtypeModiTime;
    }

    public void setThingandtypeModiTime(Date thingandtypeModiTime) {
        this.thingandtypeModiTime = thingandtypeModiTime;
    }

    public String getThingandtypeUserCreater() {
        return thingandtypeUserCreater;
    }

    public void setThingandtypeUserCreater(String thingandtypeUserCreater) {
        this.thingandtypeUserCreater = thingandtypeUserCreater == null ? null : thingandtypeUserCreater.trim();
    }

    public String getThingandtypeUserMaster() {
        return thingandtypeUserMaster;
    }

    public void setThingandtypeUserMaster(String thingandtypeUserMaster) {
        this.thingandtypeUserMaster = thingandtypeUserMaster == null ? null : thingandtypeUserMaster.trim();
    }
}
