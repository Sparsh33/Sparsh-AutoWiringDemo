package com.sparshGupta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach {

//    @Autowired
//    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

//    constructor for DI
    @Autowired
    public BaseballCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        System.out.println("Inside Baseball Coach Constructor!");
        this.fortuneService = fortuneService;
    }

//    //setter method for DI
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    //any method for DI
//    @Autowired
//    public void randomMethodForDI(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Jump 200 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    @PostConstruct
    private void InitializeMyBean() {
        System.out.println("Inside bean Initialize method!");
    }

    @PreDestroy
    private void DestroyMyBean() {
        System.out.println("Inside bean destroy method!");
    }
}
