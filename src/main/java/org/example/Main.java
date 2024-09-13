package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printThreeWords(); //1 метод
        checkSumSign(); // 2 метод
        printColor(); // 3 метод
        compareNumbers(); // 4 метод
        sumBorder(10, 5); // 5 метод
        positiveNegativeNumbers(-3); // 6 метод
        returnNumbers(5); // 7 метод
        lineOutput("слово", 5); // 8 метод
        visokosniyYear(100); // 9 метод

        // 10 задание
        int[] nums = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));

        // 11 задание
        int [] nums1 = new int[100];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums1));

        // 12 задание
        int[] nums2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < 6) {
                nums2[i] = nums2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(nums2));

        // 13 задание
        int[][] square = new int[4][4];
        for (int i = 0; i < 4; i++) {
            square[i][i] = 1;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

        methodArrs(8,3); // 14 задание
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = -23;
        int b = 7;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 134;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 89;
        int b = 17;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static boolean sumBorder(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void positiveNegativeNumbers(int a) {
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    private static boolean returnNumbers(int a) {
        if (a >= 0 ) {
            return false;
        } else {
            return true;
        }
    }

    private static void lineOutput(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }

    }

    private static boolean visokosniyYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) ^ (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private static void methodArrs(int len, int initialValue) {
        int[] massiv = new int[len];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = initialValue;
        }
        System.out.println(Arrays.toString(massiv));
    }

}