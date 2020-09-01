package com.rinavenessa.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting practice";
    }
    @Override
    public String getFortune(){
        return "Just do it:" +fortuneService.getDailyFortune();
    }

}
