package com.lsg.movie.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket geSwaggerDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/rating/*"))
				.apis(RequestHandlerSelectors.basePackage("com.lsg.movie")).build()
				.apiInfo(new ApiInfo("Movie Rating", "Movie rating provider service", "1.0", "http://google.com",
						new Contact("LSG", "http://google.com", "lsg@gmail.com"), "License", "http://google.com",
						Collections.emptyList()));
	}
}
