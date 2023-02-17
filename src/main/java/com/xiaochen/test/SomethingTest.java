package com.xiaochen.test;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
public class SomethingTest {

    public static void main(String[] args) {

        // 访问静态方法
        IConvert<String, String> convert = Something::startsWith;

        String convert1 = convert.convert("123");

        System.out.println(convert1);

        // 访问对象方法
        Something something = new Something();

        IConvert<String, String> converts = something::endWith;

        String convert2 = converts.convert("java");

        System.out.println(convert2);

        // 访问构造方法
        IConvert<String, Something> convertss = Something::new;

        Something test = convertss.convert("test");

        System.out.println(test);

        IConvert<String, Long> convert3 = something::centerWith;

        Long convert3Test1 = convert3.convert("test");

        System.out.println(convert3Test1);

    }
}
