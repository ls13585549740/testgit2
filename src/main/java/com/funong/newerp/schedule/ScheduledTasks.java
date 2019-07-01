package com.funong.newerp.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    HelloSchedule helloSchedule;

    //@Scheduled(fixedRate = 1000 * 60)
    @Scheduled(cron = "0 */100  *  * * * ")
    public void cronTask() {
        System.out.println("cronTask");
        //helloSchedule.process();
    }

    @Scheduled(cron = "${jobs.taskconfig}")
    public void cronConfigTask() {
        System.out.println("cronConfigTask");
        //helloSchedule.process();
    }

}
