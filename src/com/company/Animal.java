package com.company;

public abstract class Animal {
    int height;
    int power;
    int stat;
    String id;
    String name;
    String type;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void anim() {
        System.out.println("Я животное");
    }

    //        public void anim(String name, String type) {
//        name = "Sobaka";
//        type = "Kit";
//        System.out.println(name + type);
//    }
    public void animFight(int height, int power) {
        this.height = height;
        this.power = power;
        this.stat = (this.height + this.power) / 2;
    }
}
