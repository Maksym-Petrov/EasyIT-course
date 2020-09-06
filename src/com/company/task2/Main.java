package com.company.task2;

public class Main {

    public static void main(String[] args) {
        Friend friend = new Friend("Harry",13,"I am friend");
        Hobby hobby = new Hobby(" football", 2," The game where players kick the ball");
       Girl girl = new Girl("Anna",19,1.79,60,hobby,friend);
       girl.say();
        girl.getInfo();
        //Как вывести друга в терминал ?

       Human boy1= new Boy("Jack",20,1.85,75);
       boy1.say();

    }
}
