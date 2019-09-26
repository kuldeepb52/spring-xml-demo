package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method");
    }
    public void customInit(){
        System.out.println("custom initializatio method");
    }
    public void customDestroy(){
        System.out.println("cistom destroy method");
    }
}
