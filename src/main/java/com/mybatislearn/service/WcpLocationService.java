package com.mybatislearn.service;

public interface WcpLocationService<Thing> {
    Object findThingWithUser(Thing thing);
}
