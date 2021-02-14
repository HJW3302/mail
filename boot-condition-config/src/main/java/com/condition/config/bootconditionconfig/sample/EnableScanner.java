package com.condition.config.bootconditionconfig.sample;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ScannerPackageRegistrar.class)
public @interface EnableScanner {
    String[] packages();
}
