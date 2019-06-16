package br.study.spring.batch;

import org.springframework.batch.item.ItemProcessor;

public class BookItemProcessor implements ItemProcessor<JavaBean, JavaBean>{

    public JavaBean process(final JavaBean javaBean) throws Exception {
		javaBean.setAuthor(javaBean.getAuthor().toUpperCase());
		javaBean.setTitle(javaBean.getTitle().toUpperCase());
        return javaBean;
    }
}
