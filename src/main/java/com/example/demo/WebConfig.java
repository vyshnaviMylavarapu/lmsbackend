package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer 
{
    @Override
    public void addCorsMappings(CorsRegistry registry) 
    {
    	registry.addMapping("/hms/**") // Allow CORS 
                .allowedOrigins("http://localhost:8080","https://lms-fronted-rho.vercel.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*") // accept all 
                .allowCredentials(true);// cookies 
   
    }
}
