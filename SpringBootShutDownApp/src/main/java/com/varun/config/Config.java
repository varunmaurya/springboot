package com.varun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * Created by Varun Maurya on 8/22/2017.
 */
@Configuration
public class Config {

    @Bean("test_executor")
    public ExecutorService executorService() {
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(100);
        RejectedExecutionHandler rejectedExecutionHandler = new ThreadPoolExecutor.CallerRunsPolicy();
        return new ThreadPoolExecutor(10, 12, 180, TimeUnit.SECONDS, blockingQueue, rejectedExecutionHandler);
    }
}
