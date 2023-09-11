package com.z.j8.j813;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ZMain15 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("test"));
        executorService.shutdown();
    }
}
