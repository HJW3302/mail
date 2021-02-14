package com.condition.config.bootconditionconfig.sample;

import com.condition.config.bootconditionconfig.demo.BeanImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableScanner(packages={"com.condition.config.bootconditionconfig.sample.bean","com.condition.config.bootconditionconfig.sample.vo"})//启用监控扫描类注解
public class ScannerPackageApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ScannerPackageApplication.class);


        context.close();

        new ScannerPackageApplication().callFunction(new FunctionImpl());
    }
    interface Function {
        void hello();
    }

    static class FunctionImpl implements Function {

        @Override
        public void hello() {
            System.out.println("调用了FunctionImpl->Hello方法");
        }
    }

    public void callFunction(Function fun) {
        fun.hello();
    }
}
