package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private static int count = 0;

    private long id;
    private String userName;
    private String firstName;
    private String secondName;
    private String lastName;
    private String userMail;
    private String userPassword;
    public List<Cat> cats = new ArrayList<>();
    public Fish fish;

    public User(Fish fish) {
        this.fish = fish;
    }


    public User() {
    }

    public static void printCount() {
        System.out.println(count);
    }

    public void delCat(Cat cat) {
        cats.remove(cat);
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }


    public static void usersCat(User user) {
        for (Cat cat : user.cats) {
            System.out.println(cat.getName());
        }

    }
    public static void userCats(User user, String name){
        for (Cat cat: user.cats){
          if(cat.name.equals(name)) {
              System.out.println(cat.getName());
          }
        }
    }


    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    @Override
    public String toString() {
        return "{\"UserID\":\"" + this.id + "\"," +
                "\"UserName\":\"" + this.userName + "\"," +
                "\"FirstName\":\"" + this.firstName + "\"," +
                "\"SecondName\":\"" + this.secondName + "\"," +
                "\"LastName\":\"" + this.lastName + "\"," +
                "\"UserMail\":\"" + this.userMail + "\"," +
                "\"UserPassword\":\"" + this.userPassword + "\"}";
    }
    Animal animal = new Animal();
}