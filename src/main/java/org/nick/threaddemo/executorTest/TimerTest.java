package org.nick.threaddemo.executorTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException, InterruptedException {

        Timer timer = new Timer();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date time = dateFormatter.parse("2018/09/15 17:56:00");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("指定时间运行.");
                System.gc();
                cancel();
            }
        }, time);
        System.out.println("主线程先结束了！！");

        //timer.cancel();
    }
}
