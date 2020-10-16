package com.luciano.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.luciano.bookstoremanager"))
          .paths(PathSelectors.any())
          .build().apiInfo(buildApInfo());
    }

	   private ApiInfo buildApInfo() {

	        return new ApiInfoBuilder()
	                .title("Bookstore Manager Course - Desenvolvida Por Luciano Alexandre")
	                .description("API REST da Loja On-Line.")
	                .version("1.0")
	                .contact( new Contact("Luciano alexandre da Silva", "https://www.criawebmobile.com.br", "luciano_dialog@yahoo.com.br"))
	                .build();
	    
	   }
}
