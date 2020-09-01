package com.rinavenessa.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //create the object
//        Coach coach = new BaseballCoach();
//       Coach trackcoach = new TrackCoach();
//
//        //use the object
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(trackcoach.getDailyWorkout());

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from the spring container
        TrackCoach theCoach = context.getBean("myCoach",TrackCoach.class);
        Coach baseCoach = context.getBean("myBaseballCoach",Coach.class);
        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call the methods on the bean
        //methods for the fortunes

        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(cricketCoach.getFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        System.out.println(baseCoach.getFortune());
        System.out.println(baseCoach.getDailyWorkout());

        //close the context
        context.close();

    }
}

