package com.twh.example.ch04.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class SystemOut {

    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("SystemOut create time at " + jobExecution.getCreateTime());
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        System.out.println("SystemOut status at " + jobExecution.getStatus());
    }
}
