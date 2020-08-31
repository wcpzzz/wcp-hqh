package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class Thingtype {
    @ApiModelProperty("")
    private String thingtypeId;

    @ApiModelProperty("类型名称")
    private String thingtypeName;

    @ApiModelProperty("修改时间")
    private Date thingtypeModiTime;

    @ApiModelProperty("创建者")
    private String thingtypeUserCreater;

    @ApiModelProperty("管理员")
    private String thingtypeUserMaster;

    public String getThingtypeId() {
        return thingtypeId;
    }

    public void setThingtypeId(String thingtypeId) {
        this.thingtypeId = thingtypeId == null ? null : thingtypeId.trim();
    }

    public String getThingtypeName() {
        return thingtypeName;
    }

    public void setThingtypeName(String thingtypeName) {
        this.thingtypeName = thingtypeName == null ? null : thingtypeName.trim();
    }

    public Date getThingtypeModiTime() {
        return thingtypeModiTime;
    }

    public void setThingtypeModiTime(Date thingtypeModiTime) {
        this.thingtypeModiTime = thingtypeModiTime;
    }

    public String getThingtypeUserCreater() {
        return thingtypeUserCreater;
    }

    public void setThingtypeUserCreater(String thingtypeUserCreater) {
        this.thingtypeUserCreater = thingtypeUserCreater == null ? null : thingtypeUserCreater.trim();
    }

    public String getThingtypeUserMaster() {
        return thingtypeUserMaster;
    }

    public void setThingtypeUserMaster(String thingtypeUserMaster) {
        this.thingtypeUserMaster = thingtypeUserMaster == null ? null : thingtypeUserMaster.trim();
    }
}
