package com.mybatislearn.dao.user.model;

import java.util.Date;

public class Location {
    private Integer id;

    private String locationName;

    private String locationMemo;

    private String locationMaster;

    private String locationSlave;

    private Date modiTime;

    private String creater;

    private String master;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    public String getLocationMemo() {
        return locationMemo;
    }

    public void setLocationMemo(String locationMemo) {
        this.locationMemo = locationMemo == null ? null : locationMemo.trim();
    }

    public String getLocationMaster() {
        return locationMaster;
    }

    public void setLocationMaster(String locationMaster) {
        this.locationMaster = locationMaster == null ? null : locationMaster.trim();
    }

    public String getLocationSlave() {
        return locationSlave;
    }

    public void setLocationSlave(String locationSlave) {
        this.locationSlave = locationSlave == null ? null : locationSlave.trim();
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