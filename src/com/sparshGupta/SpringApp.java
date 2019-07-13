package com.sparshGupta;

import com.sparshGupta.BaseballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        //initialise context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //fetch bean
        BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);

        //call bean methods
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        //close context
        context.close();

    }

}
