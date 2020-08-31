package com.mybatislearn.dao.dto;

import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.User;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;


@ApiModel
@Data
public class ThingWithThingtypeWithUserWithLocation extends Thing {
    //连表查询
    private List<Thingtype> thingtypesList;
    //连表查询
    private User thingUserMasterObject;
    //连表查询
    private User thingUserCreaterObject;
    //连表查询
    private List<Location> thingLocationList;
}
