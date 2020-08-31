package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thingandlocation {
    @ApiModelProperty("")
    private String thingandlocationId;

    @ApiModelProperty("物品id")
    private String thingandlocationThingId;

    @ApiModelProperty("地点id")
    private String thingandlocationLocationId;

    @ApiModelProperty("创建者")
    private String thingandlocationUserCreater;

    @ApiModelProperty("管理者")
    private String thingandlocationUserMaster;

    @ApiModelProperty("修改时间")
    private Date thingandlocationModiTime;

    public String getThingandlocationId() {
        return thingandlocationId;
    }

    public void setThingandlocationId(String thingandlocationId) {
        this.thingandlocationId = thingandlocationId == null ? null : thingandlocationId.trim();
    }

    public String getThingandlocationThingId() {
        return thingandlocationThingId;
    }

    public void setThingandlocationThingId(String thingandlocationThingId) {
        this.thingandlocationThingId = thingandlocationThingId == null ? null : thingandlocationThingId.trim();
    }

    public String getThingandlocationLocationId() {
        return thingandlocationLocationId;
    }

    public void setThingandlocationLocationId(String thingandlocationLocationId) {
        this.thingandlocationLocationId = thingandlocationLocationId == null ? null : thingandlocationLocationId.trim();
    }

    public String getThingandlocationUserCreater() {
        return thingandlocationUserCreater;
    }

    public void setThingandlocationUserCreater(String thingandlocationUserCreater) {
        this.thingandlocationUserCreater = thingandlocationUserCreater == null ? null : thingandlocationUserCreater.trim();
    }

    public String getThingandlocationUserMaster() {
        return thingandlocationUserMaster;
    }

    public void setThingandlocationUserMaster(String thingandlocationUserMaster) {
        this.thingandlocationUserMaster = thingandlocationUserMaster == null ? null : thingandlocationUserMaster.trim();
    }

    public Date getThingandlocationModiTime() {
        return thingandlocationModiTime;
    }

    public void setThingandlocationModiTime(Date thingandlocationModiTime) {
        this.thingandlocationModiTime = thingandlocationModiTime;
    }
}
