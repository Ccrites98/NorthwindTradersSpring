package com.pluralsight;
//annotations and spring framework
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.pluralsight")
public class ApplicationConfig {
}