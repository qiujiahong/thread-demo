package org.nick.threaddemo.callablecreate;

import java.util.concurrent.Callable;

public class CallableThreadTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception
    {
        int i = 0;
        for(;i<100;i++)
        {
            System.out.println("子线程:"+Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}