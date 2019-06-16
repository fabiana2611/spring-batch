package br.study.spring.batch.basic;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigJava { 
	
   public static void main(String[] args) throws Exception { 
  
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.register(SpringConfig.class);
       context.refresh();
        
       JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
       Job job = (Job) context.getBean("helloWorldJob");
       System.out.println("Starting the batch job");
       try {
           JobExecution execution = jobLauncher.run(job, new JobParameters());
           System.out.println("Job Status : " + execution.getStatus());
           System.out.println("Job completed");
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Job failed");
       }
       
   }    
}  
