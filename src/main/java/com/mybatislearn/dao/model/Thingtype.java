package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Thingtype {
    @Getter @Setter private Integer id;

    @Getter private String name;

    @Getter @Setter private Date modiTime;

    @Getter private String creater;

    @Getter private String master;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }
}
