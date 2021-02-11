package com.company;

import java.util.*;

public class AnimaUtil  {
    public static int catNum;

    public static void catName() {
        Cat cat = new Cat();
        String[] catNames = {"Биба", "Мася", "Мурзик", "Борис", "Джек"};

        List<String> catNam = null;
        Random rnd = new Random();
        for (int i = 0; i < catNum++; i++) {
            if (catNam == null || catNam.size() == 0) {
                catNam = new ArrayList<>(Arrays.asList(catNames));
            }
            String catName = catNam.remove(rnd.nextInt(catNam.size()));
            if (cat instanceof Animal) {
                System.out.println(catName);
            }
        }
    }


    public static void dogName() {
        Dog dog = new Dog();
        String[] dogNames = {"Боба", "Шарик", "Гринч", "Майк", "Кактус"};

        List<String> dogNam = null;
        Random rnd = new Random();
        for (int i = 0; i < dogNames.length; i++) {
            if (dogNam == null || dogNam.size() == 0) {
                dogNam = new ArrayList<>(Arrays.asList(dogNames));
            }
            String dogName = dogNam.remove(rnd.nextInt(dogNam.size()));
            if (dog instanceof Animal) {
                System.out.println(dogName);
            } else System.out.println("Собака не собака");
        }
    }
}


