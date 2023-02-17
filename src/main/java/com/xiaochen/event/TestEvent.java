package com.xiaochen.event;

import org.springframework.context.ApplicationEvent;

/**
 * 应用事件，职责为定义业务
 * @author Chenyufeng
 * @date 2023/2/13
 */
public class TestEvent extends ApplicationEvent {

    private String message;

    public TestEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public TestEvent(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
