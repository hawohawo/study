package com.xiaochen.readresource;

import cn.hutool.core.io.IoUtil;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Chenyufeng
 * @date 2023/2/2
 */
public class ReadResource {

    public static void main(String[] args) {

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.yml");

        String read = IoUtil.read(inputStream, StandardCharsets.UTF_8);

        System.out.println(read);

//        InputStream resourceAsStream = this.getClass().getResourceAsStream("application.yml");

//        String read1 = IoUtil.read(resourceAsStream, StandardCharsets.UTF_8);

//        System.out.println(read1);

    }
}
