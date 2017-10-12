package com.twh.example.ch04.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class SystemOutJobExecutionListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("jobExecution create time at " + jobExecution.getCreateTime());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("jobExecution status at " + jobExecution.getStatus());
    }
}
