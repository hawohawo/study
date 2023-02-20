package com.xiaochen.bean;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
public class MapTest {

    public static void main(String[] args) throws Exception {
//        Map map = new HashMap();
//
//        //向集合中添加元素
//        map.put("apple","新鲜的苹果");
//        map.put("computer","配置优良的计算机");
//        map.put("book","堆积成山的图书");
//        //向集合中添加时间对象
//        map.put("time",new Date());
//
//        //获取Key集合对象
//        Set set = map.keySet();
//        Set set1 = map.entrySet();
//
//        // 输出map
//        System.out.println(set);
//        System.out.println(set1);
        //输出键名
//        for (Object keyName : set) {
//            System.out.println("键名：" + keyName);
//            System.out.println("======>");
//            System.out.println("键值：" + map.get(keyName));
//        }
//        for (Object data : set1) {
//            System.out.println(data);
//        }

//        List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
//        String collect = list.stream().distinct().peek(e -> System.out.println("Debug value: " + e)).collect(Collectors.joining(","));
//        System.out.println(collect);

//        String str = "未来陪伴我一生的人注定不是你。放弃吧，年轻人";
//        String[] split = str.split("，|你");
//        for (String s : split) {
//            System.out.println(s);
//        }
//
//        StringBuilder str1 = new StringBuilder();
//        str1.append("测试使用,StringBuilder");
//        System.out.println(str1);
//
//        StringBuffer str2 = new StringBuffer();
//        str2.append("测试使用,StringBuffer");
//        System.out.println(str2);
//
//        // 面一
//        short v1 = 1;
//        short v2 = 1;
//        v2 += 1;
//        System.out.println(v1);
//        System.out.println(v2);
//
//        //面二
//        Integer a = 128, b = 128, c = 127, d = 127;
//        System.out.println(a.equals(b));
//        System.out.println(c.equals(d));

        // HashMap 查看容量以及阈值的方式
//        HashMap<String, String> map = new HashMap<>(16);
//        Class<? extends HashMap> type = map.getClass();
//        Method capacity = type.getDeclaredMethod("capacity");
//        Field threshold = type.getDeclaredField("threshold");
//        capacity.setAccessible(true);
//        threshold.setAccessible(true);
//        System.out.println("容量：" +capacity.invoke(map));
//        System.out.println("阈值：" +threshold.get(map));
    }
}
