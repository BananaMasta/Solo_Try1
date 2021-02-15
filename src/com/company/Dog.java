package com.company;

public class Dog extends Animal {
    public static int dogNum;

    Dog(){
        dogNum++;
        System.out.println();
    }

    @Override
    public void anim() {
        System.out.println("Я собака");
    }

    @Override
    public void anim(int height, int power) {
        height = 10;
        power = 5;
        System.out.println(stat);
    }
}

