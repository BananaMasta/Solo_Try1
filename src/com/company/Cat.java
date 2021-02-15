package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.UUID;

public class Cat extends Animal {

    public static int catNum = 0;

    Cat() {
        catNum++;
        System.out.println(catNum);
    }
      Cat(String name){
        this.name=name;
        System.out.println(this.getName());
    }


    @Override
    public void anim() {
        System.out.println("Я Кот ");
    }

    @Override
    public void anim(int height, int power) {
        height = 9;
        power = 10;
        System.out.println(stat);
    }
}