package com.mybatislearn.dao.dto;

import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.User;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;


@ApiModel
@Data
public class ThingThingtype extends Thing {
    //连表查询
    private List<Thingtype> thingtypes;
    //连表查询
    private List<User> user2;
    //连表查询
    private List<User> user3;
}
