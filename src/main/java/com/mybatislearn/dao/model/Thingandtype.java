package com.mybatislearn.dao.model;

import java.util.Date;

public class Thingandtype {
    private Integer id;

    private Integer thingId;

    private Integer thingtypeId;

    private Date modiTime;

    private String creater;

    private String master;

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

    public Integer getThingtypeId() {
        return thingtypeId;
    }

    public void setThingtypeId(Integer thingtypeId) {
        this.thingtypeId = thingtypeId;
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
