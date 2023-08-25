package Lesson4.Redrover.com;

import java.util.Arrays;

public class HW_4_2 {
    public static void main(String[] args) {
//        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
//        вывести результат возведения в степень.

        int base = 5;
        int power = 1;

        while (Math.pow(base, power) < 10000) {
            double result = Math.pow(base, power);
            System.out.println(base + "^" + power + " = " + result);
            power++;
        }
    }
}
