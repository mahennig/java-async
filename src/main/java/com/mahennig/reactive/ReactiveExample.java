package com.mahennig.reactive;

import java.util.concurrent.CompletableFuture;


public class ReactiveExample{


    public static void main(String[] args) {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                System.out.println("Task 1 is running on thread " + Thread.currentThread().getName());
            });

            CompletableFuture<Void> anotherFuture = CompletableFuture.runAsync(() -> {
                System.out.println("Task 2 is running on thread " + Thread.currentThread().getName());
            });

            // Wait for both tasks to complete
            CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future, anotherFuture);

            combinedFuture.join(); // This blocks until both tasks are done
    }

}
