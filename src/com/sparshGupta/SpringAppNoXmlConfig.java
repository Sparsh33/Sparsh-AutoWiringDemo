package com.sparshGupta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppNoXmlConfig {

    public static void main(String[] args) {

        //intialise context with java config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from the container
        Coach coach = context.getBean("baseballCoach", Coach.class);

        //call bean methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        //close context
        context.close();
    }
}
