package com.green.hoteldog.common;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Dog Hotelling Service Ver.1")
                        .description("애견호텔링중개서비스 v1")
                        .version("2.0.0")
                );
    }
}
