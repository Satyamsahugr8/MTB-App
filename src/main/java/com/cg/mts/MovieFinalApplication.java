package com.cg.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class MovieFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFinalApplication.class, args);
	}
}
