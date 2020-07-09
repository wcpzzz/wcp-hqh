package com.mybatislearn.dao.user.model;

import java.util.Date;

public class Thingandlocation {
    private Integer id;

    private Integer thingId;

    private Integer locationId;

    private String creater;

    private String master;

    private Date modiTime;

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

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
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

    public Date getModiTime() {
        return modiTime;
    }

    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }
}