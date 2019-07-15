package com.sparshGupta;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Today is not lucky so watch your back!";
    }

}
