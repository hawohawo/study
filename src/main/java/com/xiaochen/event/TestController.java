package com.xiaochen.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chenyufeng
 * @date 2023/2/13
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private PublishEvent publishEvent;

    @RequestMapping("pub")
    public void pub() {
        for (int i = 0; i < 5; i++) {
            publishEvent.publish("你若为我繁华，你好呀：" + (i + 1));
        }
    }
}
