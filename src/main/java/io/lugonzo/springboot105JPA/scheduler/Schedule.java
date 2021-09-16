package io.lugonzo.springboot105JPA.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
@EnableScheduling
public class Schedule {

    @Scheduled(fixedRate = 2000L ,initialDelay = 5000L)
    public void job1(){
        log.info("Job1 current Time " + new Date());
    }

    @Scheduled(fixedRate = 2000L ,initialDelay = 5000L)
    public void job2(){
        log.info("Job2 current Time " + new Date());
    }
}
