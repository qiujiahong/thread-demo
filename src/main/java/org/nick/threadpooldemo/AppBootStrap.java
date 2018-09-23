package org.nick.threadpooldemo;

import java.util.concurrent.*;

public class AppBootStrap {
    public static void main(String[] args) {

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello World"));

    }
}
