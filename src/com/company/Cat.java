package com.company;

public class Cat extends Animal {
    @Override
    public void anim() {
        System.out.println("Я Кот ");
    }

    @Override
    public void anim(String name, String type) {
        name = "Kit";
        type = " Kit";
        System.out.println(name + type);
    }
}