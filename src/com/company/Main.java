package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static class Grop{

    }
    public class Grip{

    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        Main.Grop grop = new Grop();
        Main.Grip grip = m.new Grip();
        Main.Grip grip1 = new Grip();
        Try t = new Try();
        Try.staticClass ts = new Try.staticClass();
        Try.publicClass tp = t.new publicClass();
        ts.just();
        tp.group();
//        AnimaUtil.circle2();


//        AnimaUtil.animalName(new Cat());
//        AnimaUtil.animalName(new Dog());
//        Cat cat = new Cat("Erl"," Cat");
//       Dog dog = new Dog("Well"," Doge");
//        Fish fish = new Fish();
//       dog.animFight(5, 6);
//        cat.animFight(5, 5);
//        AnimaUtil.fight(fish,cat);
//        AnimaUtil.fight(dog,cat);
    }
    public static void test1(){
        Try t = new Try();
        Try.staticClass ts = new Try.staticClass();
        Try.publicClass tp = t.new publicClass();
    }

    public static void stud() {
        Integer a = 12;
        Integer b = 12;
        Fish fish = new Fish("ghgh", "kjlkj");
        Fish fish1 = new Fish("lolo", "lolo");
        Fish fish2 = new Fish("ghgh", "kjlkj");
        System.out.println(fish == fish1);
        System.out.println(a == b);
        System.out.println(fish.hashCode());
        System.out.println(fish2.hashCode());
        System.out.println(fish1.hashCode());


    }


    public static void test() {
        User user = new User();
        for (int i = 0; i < 2; i++) {
            Cat cat = new Cat();
            cat.setName(UUID.randomUUID().toString());
            user.addCat(cat);
        }
        User.usersCat(user);
    }

    public static void addUserInfo() throws IOException {
        Set<User> set = new HashSet<>();
        File file = new File("C:/stud/solo.txt");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Введите свой ник");
        String username = scanner.nextLine();
        if (searchByUsername(readUserinfo(), username) != null) {
            System.out.println("user already exists");
        } else user.setUserName(username);
        user.setUserName(scanner.nextLine());
        System.out.println("Введите свою Фамилию");
        user.setFirstName(scanner.nextLine());
        System.out.println("Введите своё Имя");
        user.setSecondName(scanner.nextLine());
        System.out.println("Введите своё Отчество");
        user.setLastName(scanner.nextLine());
        System.out.println("Введите свою Поту");
        user.setUserMail(scanner.nextLine());
        System.out.println("Придумайте пароль");
        user.setUserPassword(scanner.nextLine());
        userIdGener(user);
        if (file.length() == 0) {
            Files.write(Paths.get(file.getPath()), user.toString().getBytes(), StandardOpenOption.APPEND);
        } else {
            String user1 = ",\n";
            user1 += user.toString();
            Files.write(Paths.get(file.getPath()), user1.getBytes(), StandardOpenOption.APPEND);
        }
        for (int i = 0; i < file.length(); i++) {

        }
    }

    public static void userIdGener(User user) {
        long x = 1;
        long y = 2356757;
        Random random = new Random();
        long gener = x + ((long) (random.nextDouble() * (y - x)));
        user.setId(gener);
    }

    public static List<User> readUserinfo() throws IOException {
        List<User> users = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String file = "C:/stud/solo.txt";
        Path path = Paths.get(file);

        Scanner scanner = new Scanner(path);
        scanner.useDelimiter("},\n");
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        for (String s : list) {
            String[] del = s.replace("\"", "").replace("{", "").replace("}", "").split(",");
            for (int i = 0; i < del.length; i++) {
                String[] str = del[i].split(":");
                map.put(str[0], str[1]);
            }
            User user = new User();
            user.setId(Long.parseLong(map.get("UserID")));
            user.setUserName(map.get("UserName"));
            user.setFirstName(map.get("FirstName"));
            user.setSecondName(map.get("SecondName"));
            user.setLastName(map.get("LastName"));
            user.setUserMail(map.get("UserMail"));
            user.setUserPassword(map.get("UserPassword"));
            users.add(user);
        }
        return users;
    }


    public static User searchByUsername(List<User> users, String username) {
        for (User u : users) {
            if (u.getUserName().equals(username)) {
                return u;
            }
        }
        return null;
    }

    public static void searchByMail(List<User> users, String usermail) {
        for (User u : users) {
            if (u.getUserMail().equals(usermail)) {
                System.out.println(u.getUserMail());
            }

        }
    }

    public static void searchByLastName(List<User> users, String userlastname) {
        for (User u : users) {
            if (u.getLastName().equals(userlastname)) {
                System.out.println(u.getLastName());
            }
        }
    }

    public static void printUsers(List<User> users) {
        for (User u : users) {
            System.out.println(u);
        }
    }

    public static void chooser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "add":
                System.out.println("Добавление пользователя");
                addUserInfo();
                break;
            case "read":
                System.out.println("Все пользователи");
                printUsers(readUserinfo());

                break;
            case "searchByUsername":
                System.out.println("Поиск");
                searchByUsername(readUserinfo(), scanner.nextLine());
                break;
            case "searchByMail":
                System.out.println("Поиск по почте");
                searchByMail(readUserinfo(), scanner.nextLine());
                break;
            case "searchByLastName":
                System.out.println("Поиск по отчеству");
                searchByLastName(readUserinfo(), scanner.nextLine());
            case "fight":
        }
    }

}



