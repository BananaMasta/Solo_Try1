package com.company;

public class Dog extends Animal {
    public static int dogNum;

    Dog() {
        dogNum++;
        System.out.println();
    }

    Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void anim() {
        System.out.println("Я собака");
    }



}

