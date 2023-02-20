package com.xiaochen.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 事件监听者
 * @author Chenyufeng
 * @date 2023/2/13
 */
@Slf4j
@Component
public class AEventListener implements ApplicationListener<TestEvent> {


    @Async
    @EventListener
    public void listener(TestEvent event) throws InterruptedException {
        Thread.sleep(2000);
        log.info("监听到数据：{}", event.getMessage());
    }

    @Override
    public void onApplicationEvent(TestEvent testEvent) {

    }
}
