package com.company.task2;

public class Main {

    public static void main(String[] args) {
        Hobby hobby = new Hobby("football",2,"The game where players kick the ball");
       Human gir1 = new Girl("Anna",19,1.79,60,hobby);
       gir1.say();


       Human boy1= new Boy("Jack",20,1.85,75);
       boy1.say();

    }
}
