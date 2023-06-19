package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// ComponentScan สามารถค้นหา component ใน package ที่เราระบุไว้ ถ้าไม่ระบุจะใช้ package ปัจจุบัน
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
