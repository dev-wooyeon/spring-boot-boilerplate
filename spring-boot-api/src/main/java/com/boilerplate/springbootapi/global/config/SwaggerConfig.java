package com.boilerplate.springbootapi.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    /// Fields

    /// Constructor

    /// Method
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // 스웨거가 RestController를 전부 스캔을 한다.
                .apis(RequestHandlerSelectors.any())
                // basePackage => 어디를 범위로 스캔을 할 것인지 작성
                // .apis(RequestHandlerSelectors.basePackage("arthur.deliveryapi"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Back End API Service")
                .description("백엔드 API 서비스 리스트 입니다.")
                .version("0.8.0")
                .termsOfServiceUrl("http://localhost:8080/api")
                .license("LICENSE")
                .licenseUrl("")
                .build();
    }

}
