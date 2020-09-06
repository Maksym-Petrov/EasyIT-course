package com.company.task2;

public class Main {

    public static void main(String[] args) {
      // Friend friend = new Friend("Harry",13,"I am friend");
      // Hobby hobby = new Hobby(" football", 2," The game where players kick the ball");
      // Girl girl = new Girl("Anna",19,1.79,60,hobby,friend);
     //  girl.say();
       // girl.getInfo();
       //girl.getInf();

        Friend friend = new Friend("Jena",13,"I am friend");
        Hobby hobby = new Hobby(" basketball", 2," The game where players kick the ball");
       Human boy= new Boy("Jack",20,1.85,75,hobby,friend);
       boy.say();
       boy.getInfo();
       boy.getInf();

       //Вроде всё получилось выводит в терминал отдельно Hobby и Friend.

    }
}
