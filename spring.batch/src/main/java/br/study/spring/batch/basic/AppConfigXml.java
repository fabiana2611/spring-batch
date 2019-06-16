package br.study.spring.batch.basic;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfigXml { 
	
   public static void main(String[] args) throws Exception { 
  
      String[] springConfig  =  { "basic/basic-config.xml" };  
      
      // Creating the application context object  
      ApplicationContext context = new ClassPathXmlApplicationContext(springConfig); 
      
      // Creating the job launcher 
      JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
  
      // Creating the job 
      Job job = (Job) context.getBean("helloWorldJob"); 
  
      try {
    	// Executing the JOB 
          JobExecution execution = jobLauncher.run(job, new JobParameters());
          System.out.println("Job Status : " + execution.getStatus());
          System.out.println("Job completed");
      } catch (Exception e) {
          e.printStackTrace();
          System.out.println("Job failed");
      }
      
      
   }    
}  
