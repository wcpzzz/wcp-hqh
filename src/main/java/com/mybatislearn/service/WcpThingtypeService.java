package com.mybatislearn.service;

public interface WcpThingtypeService<Thing> {
    Object findListThingtypeWithUser(Thing thing);
}
