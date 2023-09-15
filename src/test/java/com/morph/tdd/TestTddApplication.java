package com.morph.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTddApplication {

	public static void main(String[] args) {
		SpringApplication.from(TddApplication::main).with(TestTddApplication.class).run(args);
	}

}
