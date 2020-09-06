package com.company.task2;

public class Friend {
    private String name;
    private int years;
    private  String say;

    public Friend (String name, int years,String say){
        this.name = name;
        this.years= years;
        this.say = say;
    }
    public void info (){
        System.out.println("Hobby:" + name + " years: " + years + " say:"+ say);
    }

}
