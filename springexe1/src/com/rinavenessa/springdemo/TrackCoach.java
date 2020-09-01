package com.rinavenessa.springdemo;

public class TrackCoach  implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService= fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run hard 5k";
    }

    @Override
    public String getFortune() {
        //use fortuneService to get a fortune
        return fortuneService.getDailyFortune();
    }
    //add init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside do my start up stuff");
    }
    //add destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside do my clean up stuff");
    }
}
