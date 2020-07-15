package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Thing {
    @Getter @Setter private Integer id;

    @Getter private String thingName;

    @Getter private String thingStatus;

    @Getter @Setter private Double thingMoney;

    @Getter @Setter private Integer thingNum;

    @Getter private String master;

    @Getter private String owner;

    @Getter @Setter private Date modiTime;

    @Getter private String creater;
    
    public void setThingName(String thingName) {
        this.thingName = thingName == null ? null : thingName.trim();
    }

    public void setThingStatus(String thingStatus) {
        this.thingStatus = thingStatus == null ? null : thingStatus.trim();
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}
