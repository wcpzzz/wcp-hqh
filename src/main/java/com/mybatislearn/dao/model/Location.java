package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Location {
    @ApiModelProperty("")
    private String locationId;

    @ApiModelProperty("地点名称")
    private String locationName;

    @ApiModelProperty("地点注释")
    private String locationMemo;

    @ApiModelProperty("地点上级")
    private String locationMaster;

    @ApiModelProperty("地点下属")
    private String locationSlave;

    @ApiModelProperty("修改时间")
    private Date locationModiTime;

    @ApiModelProperty("创建者")
    private String locationUserCreater;

    @ApiModelProperty("管理者")
    private String locationUserMaster;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId == null ? null : locationId.trim();
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

    public Date getLocationModiTime() {
        return locationModiTime;
    }

    public void setLocationModiTime(Date locationModiTime) {
        this.locationModiTime = locationModiTime;
    }

    public String getLocationUserCreater() {
        return locationUserCreater;
    }

    public void setLocationUserCreater(String locationUserCreater) {
        this.locationUserCreater = locationUserCreater == null ? null : locationUserCreater.trim();
    }

    public String getLocationUserMaster() {
        return locationUserMaster;
    }

    public void setLocationUserMaster(String locationUserMaster) {
        this.locationUserMaster = locationUserMaster == null ? null : locationUserMaster.trim();
    }
}
