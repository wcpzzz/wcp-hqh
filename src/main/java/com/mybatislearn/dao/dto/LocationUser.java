package com.mybatislearn.dao.dto;

import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@ApiModel
@Data
public class LocationUser extends Location {
    //连表查询
    @ApiModelProperty("user")
    private List<User> user;
}
