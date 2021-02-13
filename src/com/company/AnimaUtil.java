package com.company;

import java.util.*;

public class AnimaUtil {

    public static void animalName(Animal animal) {
        String[] catNames = {"Биба", "Мася", "Мурзик", "Борис", "Джек"};
        String[] dogNames = {"Боба", "Шарик", "Гринч", "Майк", "Кактус"};


        Random rnd = new Random();

        if (animal instanceof Cat) {
            int index = rnd.nextInt(catNames.length);//0 inclusive, num exclusive.
            animal.setName(catNames[index]);
        }
        if (animal instanceof Dog) {
            int index = rnd.nextInt(dogNames.length);//0 inclusive, num exclusive.
            animal.setName(dogNames[index]);
        }
        System.out.println(animal.getName());
    }
}
