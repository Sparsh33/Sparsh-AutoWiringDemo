package com.sparshGupta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppNoXmlConfig {

    public static void main(String[] args) {

        //intialize context with java config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from the container
//        Coach coach = context.getBean("tennisCoach", Coach.class);
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

        //call bean methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        //call bean properties
        System.out.println(coach.getName());
        System.out.println(coach.getEmail());

        //close context
        context.close();
    }
}
