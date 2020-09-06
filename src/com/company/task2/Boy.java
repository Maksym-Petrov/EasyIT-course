package com.company.task2;

public class Boy extends Human {
    private Friend friend;
    private Hobby hobby;
    public Boy(String name, int age, double height, double weight,Hobby hobby,Friend friend) {
        super(name, age, height, weight,hobby,friend);
        this.hobby= hobby;
        this.friend = friend;
    }



    public void getInfo(){
        hobby.info();
    }
    public void getInf(){friend.inf();}

    @Override
    public void say() {
        super.say();
    }
}

