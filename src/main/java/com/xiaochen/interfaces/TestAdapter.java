package com.xiaochen.interfaces;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Chenyufeng
 * @date 2023/2/15
 */
public class TestAdapter implements InitializingBean {

    @Autowired(required = true)
    private List<ProtocolAdapter> protocolAdapters;

    @Override
    public void afterPropertiesSet() throws Exception {
//        if (protocolAdapters != null && !protocolAdapters.isEmpty()) {
//
//            type2Adapter = protocolAdapters.stream()
//                    .peek(adapter -> {
//                        if (adapter instanceof ClientAware) {
//                            ((ClientAware) adapter).setClientManager(this);
//                        }
//                    })
//                    .collect(Collectors.toMap(ProtocolAdapter::protocolType,
//                            Function.identity()));
//        } else {
//            type2Adapter = new HashMap<>();
//        }
    }
}
