package com.condition.config.bootconditionconfig.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

public class MyBeanDefinitionProcessor implements BeanPostProcessor {
    private List<String> packages;

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (String pack : packages) {
            if (bean.getClass().getName().startsWith(pack)){
                System.out.println("instance bean:"+bean.getClass().getName());
            }
        }
        return bean;
    }
}
