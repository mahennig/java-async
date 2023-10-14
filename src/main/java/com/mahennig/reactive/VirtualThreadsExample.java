package com.mahennig.reactive;

public class VirtualThreadsExample {

    public static void main(String[] args) {
        Thread.ofVirtual()
                .name("Task 1")
                .start(() -> System.out.println("Task 1 is running on thread " + Thread.currentThread().getName()));

        Thread.ofVirtual()
                .name("Task 2")
                .start(() -> System.out.println("Task 2 is running on thread " + Thread.currentThread().getName()));

    }
}
