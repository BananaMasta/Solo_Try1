package com.company;

public class Dog extends Animal {
    public static int dogNum;

    Dog(){
        dogNum++;
        System.out.println();
    }
    Dog(String name) {
        this.name = name;
    }

    @Override
    public void anim() {
        System.out.println("Я собака");
    }


}

