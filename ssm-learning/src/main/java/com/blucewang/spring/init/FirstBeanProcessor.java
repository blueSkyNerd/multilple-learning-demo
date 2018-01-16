package com.blucewang.spring.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by bluceWang on 2018/1/14/014.
 */
public class FirstBeanProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("FirstBeanProcessor.postProcessBeforeInitialization"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("FirstBeanProcessor.postProcessAfterInitialization"+beanName);
        return bean;
    }
}
