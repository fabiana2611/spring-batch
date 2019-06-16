package br.study.spring.batch.database.configjava;

import org.springframework.batch.item.ItemProcessor;

import br.study.spring.batch.JavaBean;

public class BookItemProcessor implements ItemProcessor<JavaBean, JavaBean> {

    public JavaBean process(final JavaBean jb) throws Exception {
    	
    	jb.setAuthor(jb.getAuthor().toUpperCase());
        jb.setTitle(jb.getTitle().toUpperCase());

        return jb;
    }

}
