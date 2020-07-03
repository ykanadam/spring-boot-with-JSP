package com.iamvickyav.MVCSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MvcSampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MvcSampleApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MvcSampleApplication.class);
	}
}
