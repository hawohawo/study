package com.xiaochen.interfaces;

/**
 * @author Chenyufeng
 * @date 2023/2/15
 */
public interface ProtocolAdapter {

    String protocolType();

    void handle(String message);
}
