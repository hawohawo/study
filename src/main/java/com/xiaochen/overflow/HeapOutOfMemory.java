package com.xiaochen.overflow;

/**
 * @author Chenyufeng
 * @date 2023/3/3
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 测试VM的配置
 -verbose:gc -Xms10M -Xmx10M -XX:MaxDirectMemorySize=5M
 -Xss160k -XX:+PrintGCDetails
 */
public class HeapOutOfMemory {
    public static void main(String[] args) {
        System.out.println("HeapOutOfMemory");
        List<Person> persons = new ArrayList<Person>();
        int i = 0;
        while(true) {
            persons.add(new Person()); // Java对象再堆中
            System.out.println("计数" + i++);
        }
    }
}
class Person { }