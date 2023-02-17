package com.xiaochen.bucket;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * @author Chenyufeng
 * @date 2023/2/8
 */
public class BucketTest {

    public static void main(String[] args) {
        // Bandwidth:带宽，也就是每秒能够通过的流量，自动维护令牌生产。
        Bandwidth limit = Bandwidth.simple(5, Duration.ofSeconds(1));
        // Bucket: 桶，不论状态，或是令牌的消费，bucket是我们操作的入口。
        Bucket bucket = Bucket4j.builder().addLimit(limit).build();
        // tryConsume: 尝试消费n个令牌，返回布尔值，表示能够消费或者不能够消费，给我们判断依据。
        if(bucket.tryConsume(6)){
            System.out.println("do something");
        }else{
            System.out.println("do nothing");
        }
    }

//    public static void main(String[] args) {
//        Bandwidth limit = Bandwidth.simple(1, Duration.ofSeconds(10));
//        Bucket bucket = Bucket4j.builder().addLimit(limit).build();
//        while(true){
//            if(bucket.tryConsume(1)){
//                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
//            }else{
//                try{
//                    System.out.println("waiting...");
//                    Thread.sleep(2000);
//                }catch (Exception e){
//                }
//            }
//        }
//    }
}
