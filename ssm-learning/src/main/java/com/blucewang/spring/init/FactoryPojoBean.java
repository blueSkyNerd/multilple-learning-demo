package com.blucewang.spring.init;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by bluceWang on 2018/1/15/015.
 */
public class FactoryPojoBean implements FactoryBean<Animal> {
    public Animal getObject() throws Exception {
        return null;
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
