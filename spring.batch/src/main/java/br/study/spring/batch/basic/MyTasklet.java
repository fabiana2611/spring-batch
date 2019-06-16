package br.study.spring.batch.basic;

import org.springframework.batch.core.StepContribution; 
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;  

/**
 * REF: https://www.tutorialspoint.com/spring_batch/spring_batch_basic_application.htm
 */
public class MyTasklet implements Tasklet { 
   
   public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {  
      System.out.println("Hello This is a sample example of spring batch"); 
      return RepeatStatus.FINISHED; 
   } 
}
