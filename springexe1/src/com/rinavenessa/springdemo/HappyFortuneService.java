package com.rinavenessa.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
