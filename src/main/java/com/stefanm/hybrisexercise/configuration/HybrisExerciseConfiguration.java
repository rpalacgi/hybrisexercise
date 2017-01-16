package com.stefanm.hybrisexercise.configuration;

import com.stefanm.hybrisexercise.endpoints.OrderEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Stefan on 15-Jan-17.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = OrderEndpoint.class)
public class HybrisExerciseConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(HybrisExerciseConfiguration.class, args);
    }
}