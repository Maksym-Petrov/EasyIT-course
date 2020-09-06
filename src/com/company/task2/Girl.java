package com.company.task2;

public class Girl extends Human {
    private Friend friend;
    private Hobby hobby;
    public Girl(String name, int age, double height, double weight, Hobby hobby,Friend friend) {
        super(name, age, height, weight);
        this.hobby= hobby;
        this.friend = friend;
    }
    public void getInfo(){
        hobby.info();
    }

    @Override
    public void say() {
        super.say();
    }


}
