package com.mybatislearn.dao.user.model;

import java.util.Date;

public class Thing {
    private Integer id;

    private String thingName;

    private String thingStatus;

    private Double thingMoney;

    private Integer thingNum;

    private String master;

    private String owner;

    private Date modiTime;

    private String creater;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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