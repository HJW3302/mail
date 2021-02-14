package com.condition.config.bootconditionconfig.sample;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;

public class ScannerPackageRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String[] attrs = (String[]) importingClassMetadata
                .getAnnotationAttributes(EnableScanner.class.getName())
                .get("packages");
        List<String> packages = Arrays.asList(attrs);
        System.out.println(packages);
        //构造器
        BeanDefinitionBuilder bdb =BeanDefinitionBuilder.rootBeanDefinition(MyBeanDefinitionProcessor.class);
        bdb.addPropertyValue("packages", packages);
        registry.registerBeanDefinition(MyBeanDefinitionProcessor.class.getName(),bdb.getBeanDefinition());
    }
}
