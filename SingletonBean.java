package com.sdle.pro1.eosb.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.thymeleaf.standard.processor.StandardInsertTagProcessor;

@Component
public class SingletonBean implements ApplicationContextAware {
    private  ApplicationContext context;
    private PrototypeBean prototypeBean;
    public void execute(){
         PrototypeBean prototypeBean=context.getBean(PrototypeBean.class);
         System.out.println(prototypeBean);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
