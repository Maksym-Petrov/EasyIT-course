package com.company.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> Telephonebook = new HashMap<>();

   Telephonebook.put("SARA", "099658265");
        Telephonebook.put("ANNA", "06787348730");
       Telephonebook.put("LARA", "0988645730");
       Telephonebook.put("HARRY", "0950967548730");
       Telephonebook.put("JONI", "08765748730");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.next().toUpperCase();

        if(Telephonebook.containsKey(name)) {
            System.out.println(name +": "+Telephonebook.get(name));
        }


    }
}