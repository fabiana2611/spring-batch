package br.study.spring.batch.database.configxml;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws Exception { 
	      String[] springConfig  = {    "databaseExample/job-config.xml" };  
	      
	      // Creating the application context object  
	      ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);  
	      
	      // Creating the job launcher 
	      JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
	   
	      // Creating the job 
	      Job job = (Job) context.getBean("helloWorldJob"); 
	   
	      // Executing the JOB 
	      JobExecution execution = jobLauncher.run(job, new JobParameters()); 
	      System.out.println("Exit Status : " + execution.getStatus()); 
	   }   
}
