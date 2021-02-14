package com.condition.config.bootconditionconfig.demo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BeanImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.condition.config.bootconditionconfig.demo.Book"
              ,"com.condition.config.bootconditionconfig.demo.User"
        };
    }
}
