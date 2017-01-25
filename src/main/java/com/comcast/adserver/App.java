package com.comcast.adserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.comcast.adserver" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {

		return application.sources(App.class, JPAConfig.class, AppConfig.class);

	}
}
