package com.luv2code.ecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Value("${allowed.origins")
    private String[] theAllowedOrings;
    @Value("${spring.data.rest.base-path")
    private String theBasePath;

    @Override
    public void addCorsMappings(CorsRegistry cors) {
        //set up cors mapping
        cors.addMapping(theBasePath+"/**").allowedOrigins(theAllowedOrings);
    }
}
