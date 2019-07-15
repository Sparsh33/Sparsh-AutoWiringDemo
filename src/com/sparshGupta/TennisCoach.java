package com.sparshGupta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Value("${coach.name}")
    private String name;

    @Value("${coach.email}")
    private String email;

    private FortuneService fortuneService;

    TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Jump as high as you can 100 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
