package br.study.spring.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<JavaBean, JavaBean> {

	public JavaBean process(JavaBean item) throws Exception {
		System.out.println("Processing Processor..." + item);
		return item;
	}

}
