package com.company;

public class Dog extends Animal {
    @Override
    public void anim() {
        System.out.println("Я собака");
    }

    @Override
    public void anim(String name, String type) {
        name = "Doge";
        type = " Doge";
        System.out.println(name + type);

    }
}

