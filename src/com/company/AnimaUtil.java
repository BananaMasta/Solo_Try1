package com.company;

import java.util.*;

public class AnimaUtil {
    static String[] a = {"fbvg", "sfsfs", "wdwd", "wdwdwd", "wdwdws", "efdrhd", "biba"};
    static int count = 0;

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

    public static void fight(Animal... animals) {
        if ((animals[0] instanceof Cat && animals[1] instanceof Fish) || (animals[1] instanceof Cat && animals[0] instanceof Fish)) {
            System.out.println("Кот съел рыбу");
//        } else if (animals[0] instanceof Animal && animals[1] instanceof Animal) {
//            fight();
//        }
        } else if (animals[0].stat > animals[1].stat) {
            System.out.println(animals[0].getName() + animals[0].getType());
        } else if (animals[0].stat < animals[1].stat) {
            System.out.println(animals[1].getName() + animals[1].getType());
        } else System.out.println("Ничья");
    }

    public static void circle() {

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "!");
            } else System.out.print(a[i] + ",");
        }

    }

    public static void circle2() {
        do {
            if (count == a.length - 1) {
                System.out.print(a[count] + "!");
            } else System.out.print(a[count] + ",");
            count++;
        } while (count < a.length) ;

        }
    }


