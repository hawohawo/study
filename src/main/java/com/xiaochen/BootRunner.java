package com.xiaochen;

import com.xiaochen.init.TaskLoad;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Chenyufeng
 * @date 2023/1/19
 */
@Component
public class BootRunner implements CommandLineRunner {

    @Autowired
    private CamelContext camelContext;

    @Autowired
    private AppProperties appProperties;

    @Override
    public void run(String... args) throws Exception {

        camelContext.getRegistry().bind(AppProperties.MARK, appProperties);
        camelContext.addRoutes(new TaskLoad(camelContext));
    }
}
