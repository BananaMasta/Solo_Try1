package com.company;

public class Try {

    static public class staticClass {
        int a = 5;
        int b = 6;
        int c = ((a * b) + 3) / 2;

        public static void just() {
            int a = 1;
            int b = 2;
            int c = a + b;
            if (c < 30) {
                System.out.println("с меньше 1");
            } else if (c > 5) {
                System.out.println("с больше 2");
            }
        }
    }

    public class publicClass {
        int a = 5;
        int b = 7;
        int c = a + b;

        public void group() {
            if (c > 2) {
                System.out.println("c больше 3");
            } else if (c < 3) {
                System.out.println("C меньше 4");
            }
        }

    }
}

