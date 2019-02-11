package com.varun.swaggerapp.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created by Varun Maurya on 2/11/2019.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(getMyAppInfo());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.varun.swaggerapp"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getMyAppInfo());
    }

    public ApiInfo getMyAppInfo() {
        ApiInfo apiInfo = new ApiInfo("Spring Boot with Swagger",
                "Spring boot app which uses swagger to document its services",
                "1.0",
                "Happy browsing our app ! ",
                new Contact("Varun Kumar Maurya","http://www.varunmaurya.50webs.com","speedvarun@gmail.com"),
                "Apache 2.0 ",
                "www.apache.org/license",
                new ArrayList<VendorExtension>()
                );
        return apiInfo;
    }
}
