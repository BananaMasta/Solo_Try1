package com.company;

public class Fish extends Animal {
    public Fish(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Fish() {
    }

    @Override
    public void anim() {
        System.out.println("Я рыбка");
    }

    @Override
    public void anim(int height, int power) {
        height = 5;
        power = 2;
        System.out.println(stat);

//        @Override
//        public boolean equals (Object obj){
//            return this.name.equals(((Fish) obj).name);
//        }
    }
}
