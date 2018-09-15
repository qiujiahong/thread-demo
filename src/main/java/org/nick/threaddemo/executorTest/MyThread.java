package org.nick.threaddemo.executorTest;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行....");
    }
}