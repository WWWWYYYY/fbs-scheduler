package org.wang.xxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.wang.business","org.wang.xxl"})
public class XxlJobApp {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobApp.class, args);
	}

}