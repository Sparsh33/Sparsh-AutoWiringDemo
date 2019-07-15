package com.sparshGupta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.sparshGupta")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //bean of the dependency i.e., happyFortuneService
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    //method to expose our bean and inject dependencies in it
    @Bean
    public Coach tennisCoach() {
        return new TennisCoach(happyFortuneService());
    }

}
