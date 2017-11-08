package com.ibm.microservices.wfd.entree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EntreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntreeApplication.class, args);
		System.out.println("Running "+EntreeApplication.class+" via Spring Boot!");
	}

	@Bean
  public Docket api() {
      return new Docket(DocumentationType.SWAGGER_2)
              .apiInfo(apiInfo())
              .select()
              .paths(regex("/entrees"))
              .build();
  }
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
					 .title("Entrees API")
					 .description("What's for dinner entrees microservice application API description using Swagger 2.0\n"
					 							+ "This microservice is part of the What's for dinner microservices reference application.")
					 .contact(new Contact("CASE Microservices Team","","almarazj@ie.ibm.com"))
					 .version("0.2")
					 .build();
	}
}
