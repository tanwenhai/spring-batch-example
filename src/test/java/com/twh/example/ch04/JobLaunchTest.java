package com.twh.example.ch04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "/ch04/job/job.xml"
})
public class JobLaunchTest {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired@Qualifier("billJob")
    private Job job;

    @Test
    public void billJob() throws Exception {
        JobExecution result = jobLauncher.run(job, (new JobParametersBuilder()
                .addDate("date", new Date()).addString("inputResource", "classpath:ch03/data/credit-card-bill-201303.csv")).toJobParameters());
        System.out.println(result.toString());
    }
}
