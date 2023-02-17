package com.xiaochen.init;

import com.xiaochen.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;

/**
 * @author Chenyufeng
 * @date 2023/1/19
 */
@Slf4j
public class TaskLoad extends EndpointRouteBuilder {

    public TaskLoad(CamelContext context) {
        super(context);
        if (context.isRunAllowed()) {
            AppProperties appProperties = getContext().getRegistry().lookupByNameAndType(AppProperties.MARK, AppProperties.class);
            switchs = appProperties.getSwitchs();
        }

    }

    private Boolean switchs;

    @Override
    public void configure() throws Exception {
        // 从数据库获取信息

    }
}
