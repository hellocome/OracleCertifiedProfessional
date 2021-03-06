package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy;

import java.util.concurrent.*;
import java.util.stream.*;

/**
 * Created by ZHJ on 3/14/2017.
 */

public class BabyPandaBathManager {
    public static void await(CyclicBarrier cb) {
        try {
            System.out.println("Await: " + Thread.currentThread().getId());
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }
    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3,()-> System.out.
                println("Clean!"));// u1
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1, i-> 1) // u2
                .limit(12)
                .forEach(i-> service.submit( // u3
                        ()-> await(cb))); // u4
        service.shutdown();
    }
}