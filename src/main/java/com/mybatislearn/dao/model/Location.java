package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Location {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("地点名称")
    private String locationName;

    @ApiModelProperty("地点注释")
    private String locationMemo;

    @ApiModelProperty("地点上级")
    private String locationMaster;

    @ApiModelProperty("地点下属")
    private String locationSlave;

    @ApiModelProperty("修改时间")
    private Date modiTime;

    @ApiModelProperty("创建者")
    private String creater;

    @ApiModelProperty("管理者")
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
