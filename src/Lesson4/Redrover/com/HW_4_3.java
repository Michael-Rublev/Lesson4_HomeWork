package Lesson4.Redrover.com;

public class HW_4_3 {
    public static void main(String[] args) {

//      Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//      Реализовать 2 варианта:
//      использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//      без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i < 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 40 + (4 - 40 % 4); i <=60; i += 4) {
            System.out.println(i);
        }
    }
}
