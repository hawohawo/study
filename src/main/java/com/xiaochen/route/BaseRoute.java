package com.xiaochen.route;

import com.xiaochen.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author Chenyufeng
 * @date 2023/1/17
 */
@Component
@Slf4j
public class BaseRoute extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {
//        from(timer("hello").period("{{timer.period}}")).routeId("hello")
//                .onException(BusinessException.class)
//                .process(exchange -> {
//                    throw new BusinessException("测试用得");
//                })
//                .transform().method("myBean", "saySomething")
//                .filter(simple("${body} contains 'foo'"))
//                .to("log:foo")
//                .end()
//                .to("stream:out");
//        from("timer:hello?period={{timer.period}}").routeId("hello")
//                .onException(BusinessException.class)
//                .maximumRedeliveries(3)
//                .redeliveryDelay(5000)
//                .continued(true)
//                .onExceptionOccurred(exchange -> {
//                    log.info("尝试重试请求");
//                })
//                .onRedelivery(exchange -> {
//                    log.info("尝试重试请求");
//                })
//                .process(exchange -> {
//                    System.out.println("============" + 123);
//                })
//                .end()
//                .transform().method("myBean", "saySomething")
//                .doTry()
//                .process(exchange -> {
//                    exchange.getIn().setHeader("tests", "测试用的1");
//                    throw new BusinessException("测试用的");
//                })
//                .doCatch(BusinessException.class)
//                .process(exchange -> {
//                    log.info("异常信息捕获");
//                })
//                .doFinally()
//                .process(exchange -> {
//                    log.info("最后的处理");
//                })
//                .end()
//                .choice()
//                .when(simple("${header.test} == '测试用的'"))
//                .process(exchange -> {
//                    log.info("123");
//                })
//                .when(simple("${header.tests} == '测试用的1'"))
//                .process(exchange -> {
//                    log.info("456");
//                })
//                .otherwise()
//                .log("response success")
//                .filter(simple("${body} contains 'foo'"))
//                .to("log:foo")
//                .end()
//                .to("stream:out");
    }
}
