package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thing {
    @ApiModelProperty("")
    private String id;

    @ApiModelProperty("物品名")
    private String thingName;

    @ApiModelProperty("物品状态（1、正常；2、待找寻；3、待补充；4、待遗弃；5、待维修；）")
    private String thingStatus;

    @ApiModelProperty("物品价格")
    private Double thingMoney;

    @ApiModelProperty("物品数量")
    private Integer thingNum;

    @ApiModelProperty("管理者")
    private String master;

    @ApiModelProperty("拥有者")
    private String owner;

    @ApiModelProperty("修改时间")
    private Date modiTime;

    @ApiModelProperty("创建者")
    private String creater;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
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
}
