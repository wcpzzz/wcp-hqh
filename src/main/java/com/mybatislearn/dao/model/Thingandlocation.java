package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Thingandlocation {
    @Getter @Setter private Integer id;

    @Getter @Setter private Integer thingId;

    @Getter @Setter private Integer locationId;

    @Getter private String creater;

    @Getter private String master;

    @Getter @Setter private Date modiTime;

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }

}
