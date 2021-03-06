package com.baeldung.concurrent.countdownlatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    private final List<String> outputScraper;
    private final CountDownLatch countDownLatch;

    public Worker(final List<String> outputScraper, final CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // Do some work
        System.out.println("Doing some logic");
        countDownLatch.countDown();
        outputScraper.add("Counted down");
    }
}
