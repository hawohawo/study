package com.xiaochen.test;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
public class Something {

    Something() {

    }

    Something(String something) {
        System.out.println(something);
    }

    static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    String endWith(String s) {
        return String.valueOf(s.charAt(s.length()-1));
    }

    Long centerWith(String s) {
        return Long.valueOf(s.charAt(s.length()-1));
    }

    void endWith() {}
}
