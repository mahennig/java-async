package com.mahennig.reactive;

import java.util.concurrent.CompletableFuture;


public class ReactiveExample {

    public static int compute(int n) {
        System.out.println("compute called");
        return n * 2;
    }

    public static CompletableFuture<Integer> create(int n) {
        return CompletableFuture.supplyAsync(() -> compute(n));
    }

    private static void nonBlocking() {
        create(4)
                .thenApply(data -> {
                    System.out.println(Thread.currentThread());
                    return data + 1;
                })
                .thenAccept(System.out::println);
        System.out.println("started");
    }


    public static void main(String[] args) {
        nonBlocking();
    }

}
