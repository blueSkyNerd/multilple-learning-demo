package com.blucewang.spring.init;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import javax.annotation.Resource;

/**
 * Created by bluceWang on 2018/1/12.
 */
public class FirstBean implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {
    @Resource
    private String name;

    public String getName() {
        return name;
    }

    public FirstBean() {
        System.out.println("调用FirstBean构造器");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("调用set方法," + name);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory," + beanFactory);
    }

    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware.setBeanName()," + name);
    }

    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()方法");
    }

//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("调用BeanFactoryPostProccessor.postProcessBeanFactory,"+beanFactory);
//    }


//    public void init() throws Exception{
//        System.out.println("firstBean的init方法");
//    }

//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("调用BeanPostProcesser.postProcessBeforeInitialization"+ JSON.toJSONString(bean)+","+beanName);
//        return bean;
//    }
//
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("调用BeanPostProcesser.postProcessAfterInitialization"+ JSON.toJSONString(bean)+","+beanName);
//        return bean;
//    }
}
