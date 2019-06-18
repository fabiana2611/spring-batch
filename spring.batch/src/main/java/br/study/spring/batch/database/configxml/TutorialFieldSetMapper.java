package br.study.spring.batch.database.configxml;

import org.springframework.batch.item.file.mapping.FieldSetMapper; 
import org.springframework.batch.item.file.transform.FieldSet; 
import org.springframework.validation.BindException;  

public class TutorialFieldSetMapper implements FieldSetMapper<Tutorial> { 
   
   public Tutorial mapFieldSet(FieldSet fieldSet) throws BindException {   
      // instantiating the Tutorial class 
      Tutorial tutorial = new Tutorial(); 
   
      tutorial.setTutorial_id(fieldSet.readInt(0));
      tutorial.setTutorial_author(fieldSet.readString(1));
      tutorial.setTutorial_title(fieldSet.readString(2));
      tutorial.setSubmission_date(fieldSet.readString(3));

      tutorial.setTutorial_icon(fieldSet.readString(4));
      tutorial.setTutorial_description(fieldSet.readString(5));
      
      return tutorial;  
   }  
} 
