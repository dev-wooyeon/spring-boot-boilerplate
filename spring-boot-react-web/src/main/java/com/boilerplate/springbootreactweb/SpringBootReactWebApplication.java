package com.boilerplate.springbootreactweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={ DataSourceAutoConfiguration.class})
public class SpringBootReactWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactWebApplication.class, args);
	}

}
