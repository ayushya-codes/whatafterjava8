package com.leanquitous.java_nineteen;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadDemo {

    record Response(String user, int order) {
    }

    /**
     * Demoing unstructured concurrency using the
     */
    static Response unstructuredConcurrency() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        // This try is with new design introduced in JDK-9
        try (executorService) {
            Future<String> userFuture = executorService.submit(VirtualThreadDemo::findUser);
            Future<Integer> orderFuture = executorService.submit(VirtualThreadDemo::findOrder);
            return new Response(userFuture.get(), orderFuture.get());
        }
    }

    private static int findOrder() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(LocalDateTime.now());
        return 1213;
    }

    private static String findUser() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(LocalDateTime.now());
        return "Ayush!";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(unstructuredConcurrency());
    }

    
}
