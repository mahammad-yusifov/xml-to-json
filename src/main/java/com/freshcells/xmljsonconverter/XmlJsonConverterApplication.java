package com.freshcells.xmljsonconverter;

import com.freshcells.xmljsonconverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class XmlJsonConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlJsonConverterApplication.class, args);
    }

    @Component
    static class BeanRetrievalRunner implements ApplicationRunner {

        @Autowired
        private ApplicationContext applicationContext;

        @Override
        public void run(ApplicationArguments args) {
            ConverterService converterService = applicationContext.getBean(ConverterService.class);
            converterService.convertXmlFiles();
        }
    }

}
