package com.example.imageprocessingrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.imageprocessingrestapi"})
@EntityScan(basePackages = { "com.example.imageprocessingrestapi"})
public class ImageProcessingRestApiApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(ImageProcessingRestApiApplication.class, args);
    }

}
