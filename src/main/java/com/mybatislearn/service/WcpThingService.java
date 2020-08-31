package com.mybatislearn.service;

import com.mybatislearn.dao.model.Thing;

public interface WcpThingService<Thing> {
    Object findThingWithUser(Thing thing);
    Object findListThingWithThingtypeWithUserWithLocation(Thing thing);
}
