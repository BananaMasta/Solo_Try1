package com.company;

public
class Animal {
    double height;
    double power;
    double stat;
    String id;
    String name;
    String type;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPower() {
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
    public void animFight(double height, double power) {
        this.height = height;
        this.power = power;
        this.stat = (this.height + this.power) / 2;
    }
    public  static void fog(){
        int a = 6;
        System.out.println(a);
    }

}
