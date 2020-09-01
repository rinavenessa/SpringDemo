package com.rinavenessa.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("we are here now");
    }

    //setters and getters

    public void setEmailAddress(String emailAddress){
        this.emailAddress =emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println(" we are in the setter now");
        this.fortuneService= fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutea";
    }

    @Override
    public String getFortune() {
        return fortuneService.getDailyFortune();
    }

}
