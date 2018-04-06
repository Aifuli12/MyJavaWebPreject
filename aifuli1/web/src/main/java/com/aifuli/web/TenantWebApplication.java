package com.aifuli.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.aifuli")
@ServletComponentScan
@EnableAutoConfiguration
public class TenantWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(TenantWebApplication.class, args);
    }
}