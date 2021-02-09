package com.company;

public abstract class Animal {

    String id;
    String name;
    String type;


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

    public void anim(String name, String type) {
        name = "Sobaka";
        type = "Kit";
        System.out.println(name + type);
    }

}
