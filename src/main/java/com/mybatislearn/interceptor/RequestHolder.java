package com.mybatislearn.interceptor;

import org.springframework.stereotype.Service;

@Service
public class RequestHolder {
//全局变量
    private final static ThreadLocal<String> requestHolder = new ThreadLocal<> ();
    public static void add(String id) {
        requestHolder.set(id);
    }

    public static String getId() {
        return requestHolder.get();
    }

    public static void remove() {
        requestHolder.remove();
    }
}
