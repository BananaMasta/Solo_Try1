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

    Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public void anim() {
        System.out.println("Я Кот ");
    }


}