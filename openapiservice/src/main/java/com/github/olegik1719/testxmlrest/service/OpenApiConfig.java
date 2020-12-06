package com.github.olegik1719.testxmlrest.service;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {

    private final String moduleName;
    private final String apiVersion;

    public OpenApiConfig(){
        this.moduleName = "testxmlrest";
        this.apiVersion = "0.0.1";
    }

    @Bean
    public OpenAPI customOpenApi(){
        final String apiTitle = String.format("%s api", moduleName);
        return new OpenAPI().info(new Info().title(apiTitle).version(apiVersion));
    }
}
