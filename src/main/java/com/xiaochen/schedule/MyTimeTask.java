package com.xiaochen.schedule;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
public class MyTimeTask extends TimerTask {

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        System.out.println("Current Time:" + format.format(calendar.getTime()));
        System.out.println("NO.1");
    }

    public static void main(String[] args) {
        MyTimeTask task = new MyTimeTask();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        // 在当前时间的基础上 +10s
        calendar.add(Calendar.SECOND,10);
        System.out.println(format.format(calendar.getTime()));
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(task,calendar.getTime(),2000);
    }
}
