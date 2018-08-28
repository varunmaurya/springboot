package com.varun.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;

/**
 * Created by Varun Maurya on 8/22/2017.
 */
@Component
public class scheduler {

    @Autowired
    @Qualifier("test_executor")
    private ExecutorService executorService;

    @Qualifier("my_sch")
    @Scheduled(fixedDelayString = "1000")
    public String run() {
        try {
            for (int x = 0; x < 100; x++) {
                final int i = x;
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            System.out.println(Thread.currentThread().getName() + " Called for " + Integer.toString(i));
                            Thread.sleep(10000);
                            System.out.println(Thread.currentThread().getName () + " I am done now " + Integer.toString(i));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }

        }catch ( Exception e){
            System.out.println("Exception");
        }
        return "Hello World!";
    }

}
