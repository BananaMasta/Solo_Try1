package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimaUtil {
    public List<Cat> catNames = new ArrayList<>();
//    public List<Dog> dogNames = new ArrayList<>();

    public static void catName() {
        Cat cat = new Cat();
        Random random = new Random();
        String[] catName = {"Барсик", "Мася", "Биба", "Борис", "Мурзик"};
        for (int i = 0; i < catName.length; i++) {
            int pos = random.nextInt(catName.length);
            if (cat instanceof Animal) {
                System.out.println(catName[pos]);
            }
        }
    }


//    public static void dogName() {
//        Dog dog = new Dog();
//        Random random = new Random();
//        String[] dogName = {"Бобик", "Кита", "Боба", "Джесси", "Шарик"};
//        for (int i = 0; i < dogName.length; i++) {
//            int pos = random.nextInt(dogName.length);
//            if (dog instanceof Animal) {
//                System.out.println(dogName[pos]);
//            }
//        }
//    }
}

