package com.twh.example.ch04.scheduler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

import java.time.LocalDateTime;

public class SchedulerLauncher {
    private Job job;
    private JobLauncher jobLauncher;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public JobLauncher getJobLauncher() {
        return jobLauncher;
    }

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }

    public void launch() throws Exception {
        JobParameters jobParameters = createJobParameters();
        jobLauncher.run(job, jobParameters);
    }

    private JobParameters createJobParameters() {
        JobParameters jobParameters = new JobParametersBuilder().addString("date", LocalDateTime.now().toString()).toJobParameters();

        return jobParameters;
    }
}
