package br.study.spring.batch.database.configxml;

import org.springframework.batch.item.ItemProcessor;  

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {  
   
   public Tutorial process(Tutorial item) throws Exception { 
      System.out.println("Processing..." + item); 
      return item; 
   }    
}   
