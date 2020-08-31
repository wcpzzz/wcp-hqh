package com.mybatislearn.service;

public interface WcpLocationService<Thing> {
    Object findLocationWithUser(Thing thing);
}
