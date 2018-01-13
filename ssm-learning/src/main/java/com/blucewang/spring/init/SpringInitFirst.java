package com.blucewang.spring.init;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bluceWang on 2018/1/11.
 */
public class SpringInitFirst {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("firstBeanFactory.xml");
        FirstBean bean = context.getBean(FirstBean.class);
        System.out.println(bean.getName());
    }
}
