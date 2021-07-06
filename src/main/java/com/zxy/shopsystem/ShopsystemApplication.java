package com.zxy.shopsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class ShopsystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ShopsystemApplication.class, args);

    }


}
