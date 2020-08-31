package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thing {
    @ApiModelProperty("")
    private String thingId;

    @ApiModelProperty("物品名")
    private String thingName;

    @ApiModelProperty("物品状态（1、正常；2、待找寻；3、待补充；4、待遗弃；5、待维修；）")
    private String thingStatus;

    @ApiModelProperty("物品价格")
    private Double thingMoney;

    @ApiModelProperty("物品数量")
    private Integer thingNum;

    @ApiModelProperty("管理者")
    private String thingUserMaster;

    @ApiModelProperty("拥有者")
    private String thingUserOwner;

    @ApiModelProperty("修改时间")
    private Date thingModiTime;

    @ApiModelProperty("创建者")
    private String thingUserCreater;

    public String getThingId() {
        return thingId;
    }

    public void setThingId(String thingId) {
        this.thingId = thingId == null ? null : thingId.trim();
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName == null ? null : thingName.trim();
    }

    public String getThingStatus() {
        return thingStatus;
    }

    public void setThingStatus(String thingStatus) {
        this.thingStatus = thingStatus == null ? null : thingStatus.trim();
    }

    public Double getThingMoney() {
        return thingMoney;
    }

    public void setThingMoney(Double thingMoney) {
        this.thingMoney = thingMoney;
    }

    public Integer getThingNum() {
        return thingNum;
    }

    public void setThingNum(Integer thingNum) {
        this.thingNum = thingNum;
    }

    public String getThingUserMaster() {
        return thingUserMaster;
    }

    public void setThingUserMaster(String thingUserMaster) {
        this.thingUserMaster = thingUserMaster == null ? null : thingUserMaster.trim();
    }

    public String getThingUserOwner() {
        return thingUserOwner;
    }

    public void setThingUserOwner(String thingUserOwner) {
        this.thingUserOwner = thingUserOwner == null ? null : thingUserOwner.trim();
    }

    public Date getThingModiTime() {
        return thingModiTime;
    }

    public void setThingModiTime(Date thingModiTime) {
        this.thingModiTime = thingModiTime;
    }

    public String getThingUserCreater() {
        return thingUserCreater;
    }

    public void setThingUserCreater(String thingUserCreater) {
        this.thingUserCreater = thingUserCreater == null ? null : thingUserCreater.trim();
    }
}
