package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter @Setter private Integer id;

    @Getter private String locationName;

    @Getter private String locationMemo;

    @Getter private String locationMaster;

    @Getter private String locationSlave;

    @Getter @Setter private Date modiTime;

    @Getter private String creater;

    @Getter private String master;

    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    public void setLocationMemo(String locationMemo) {
        this.locationMemo = locationMemo == null ? null : locationMemo.trim();
    }

    public void setLocationMaster(String locationMaster) {
        this.locationMaster = locationMaster == null ? null : locationMaster.trim();
    }

    public void setLocationSlave(String locationSlave) {
        this.locationSlave = locationSlave == null ? null : locationSlave.trim();
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }
}
