package com.rinavenessa.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        //load the spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean results = (theCoach == alphaCoach);
        System.out.println("\npointing to the same object: " + results);

        System.out.println("\nmemory location: " + theCoach);
        System.out.println("\nmemory location: " + alphaCoach);

//         if(theCoach == alphaCoach){
//             System.out.println("they are pointing to the same thing");
//         }else
//             System.out.println("they are not pointing to the same thing");
//    }
        context.close();
    }

}
