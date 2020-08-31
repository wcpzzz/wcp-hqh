package com.mybatislearn.service;

public interface WcpThingtypeService<Thing> {
    Object findThingtypeWithUser(Thing thing);
}
