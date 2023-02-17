package com.xiaochen;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    public static final String MARK = "APP_CONFIG";

    /**
     * 测试开关
     */
    private Boolean switchs = true;

}
