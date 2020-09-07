package com.company.task2;

public class Main {

    public static void main(String[] args) {

         Girl girl = new Girl("Anna",19,1.79,60,
                 new Hobby(" football", 2," The game where players kick the ball"),
                 new Friend("Harry",13,"I am friend"));
          girl.say();
        girl.getInfo();
         girl.getInf();


        Human boy= new Boy("Jack",20,1.85,75,
                new Hobby(" basketball", 2," The game where players kick the ball"),
                new Friend(" lena",  13, " I am friend") );
        boy.say();
        boy.getInfo();
        boy.getInf();



    }
}