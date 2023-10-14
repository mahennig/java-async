package com.mahennig.reactive;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImperativeExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is running on thread " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}