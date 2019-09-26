package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actorBean;

    public Movie(Actor actorBean) {
        this.actorBean = actorBean;
    }




    public void getActorDetails(){
         actorBean.getDetails();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory set");
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name set");
        System.out.println(s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context set");
        System.out.println(applicationContext);
    }
}
