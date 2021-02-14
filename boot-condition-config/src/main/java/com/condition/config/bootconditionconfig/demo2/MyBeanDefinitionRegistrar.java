package com.condition.config.bootconditionconfig.demo2;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        //创建构造器对象
        BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        BeanDefinition beanDefinition = bdb.getBeanDefinition();
        registry.registerBeanDefinition("user",beanDefinition);

        //创建构造器对象
        BeanDefinitionBuilder bdb1 = BeanDefinitionBuilder.rootBeanDefinition(Book.class);
        BeanDefinition beanDefinition1 = bdb1.getBeanDefinition();
        registry.registerBeanDefinition("book",beanDefinition1);

    }
}
