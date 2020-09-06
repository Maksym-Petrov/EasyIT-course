package com.company.task2;

public class Human {
    private String name;
    private Hobby hobby;
    private Friend friend;
    private int age;
    private double height;
    private double weight;

    public Human (String name,int age,double height, double weight,Hobby hobby,Friend friend ){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.friend = friend;
        this.hobby= hobby;


    }
    public void getInfo(){
        hobby.info();
    }
    public void getInf(){friend.inf();}





    public void say (){



        System.out.println("Name:"+name+ "\n"+ "Age:" + age + "\n"+ "Height:" +  height + "\n"+"Weight:"  + weight+"\n");
    }

}
