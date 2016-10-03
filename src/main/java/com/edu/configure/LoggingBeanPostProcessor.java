package com.edu.configure;

import com.edu.controllers.UploadController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by iivaniv on 08.08.2016.
 */
@Component
public class LoggingBeanPostProcessor implements BeanPostProcessor {

    private AtomicInteger counter = new AtomicInteger();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if ( bean instanceof UploadController) {
            Class clazz = bean.getClass();
            System.out.println("After loggin post processor : " + bean + "; bean name : " + beanName);
            try {
                Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
                    System.out.println("Profiling");
                    Object result = method.invoke(bean, args);
                    return result;
                });
            } catch ( Exception e) {
                e.printStackTrace();
            }

        }
        return bean;
    }
}
