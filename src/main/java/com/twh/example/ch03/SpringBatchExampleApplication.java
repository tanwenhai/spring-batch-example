package com.twh.example.ch03;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchExampleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBatchExampleApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("ch03/job/job.xml");
		JobLauncher launcher = context.getBean(JobLauncher.class);
		Job job = (Job)context.getBean("billJob");
		try {
            JobExecution result = launcher.run(job, new JobParameters());
            System.out.println(result);
        } catch (Exception e) {
		    e.printStackTrace();
        }
    }
}
