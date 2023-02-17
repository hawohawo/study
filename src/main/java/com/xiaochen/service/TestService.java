package com.xiaochen.service;

/**
 * @author Chenyufeng
 * @date 2023/2/9
 */
public abstract class TestService {

    protected String str = "test";

    public TestService(String str) {
        this.str = str;
    }

    public abstract void excuted();

}
