package br.study.spring.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class Mapper implements FieldSetMapper<JavaBean> {

	public JavaBean mapFieldSet(FieldSet fieldSet) throws BindException {

		// Instantiating the report object
		JavaBean tutorial = new JavaBean();

		// Setting the fields
		tutorial.setId(fieldSet.readInt(0));
		tutorial.setAuthor(fieldSet.readString(1));
		tutorial.setTitle(fieldSet.readString(2));
		tutorial.setSubmission_date(fieldSet.readString(3));

		return tutorial;
	}
}
