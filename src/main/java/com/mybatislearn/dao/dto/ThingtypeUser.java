package com.mybatislearn.dao.dto;

import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@ApiModel
@Data
public class ThingtypeUser extends Thingtype {
    //连表查询
    private User thingtypeUserMasterObject;
    //连表查询
    private User thingtypeUserCreaterObject;
}
