package com.xiaochen.interfaces;

/**
 * @author Chenyufeng
 * @date 2023/2/15
 */
public class Ccdc10001Adapter implements ProtocolAdapter{

    @Override
    public String protocolType() {
        return "ccdc.10001.001.01";
    }

    @Override
    public void handle(String message) {
        System.out.println(message);
    }
}
