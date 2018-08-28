package com.varun.shutdown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Varun Maurya on 8/22/2017.
 */
@Component
public class GracefulShutdown implements  ApplicationListener<ContextClosedEvent> {

    @Autowired
    @Qualifier("test_executor")
    private ExecutorService executorService;

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("****** Interrupted ******");
        ApplicationContext ctx = event.getApplicationContext();
        ConfigurableApplicationContext c = (ConfigurableApplicationContext)ctx;
        // No more new task can be assigned to executor service
        executorService.shutdown();

        System.out.println("No of task in Queue :: "+ ((ThreadPoolExecutor)executorService).getQueue().size());
        System.out.println("Removing from Queue :: " + ((ThreadPoolExecutor)executorService).getQueue().size());
        ((ThreadPoolExecutor)executorService).getQueue().clear();

        //wait until all the currently running task are done
        System.out.println("Waiting for running tasks to complete");
        while(((ThreadPoolExecutor)executorService).getActiveCount() >0 ){

        }
        //close context
        c.close();


    }

}