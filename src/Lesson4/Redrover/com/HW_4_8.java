package Lesson4.Redrover.com;

public class HW_4_8 {
    public static void main(String[] args) {
//        Задача №8
//        Дан массив произвольных целых чисел.
//        необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Переменные для хранения данных подсчёта
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < array.length; i++) {
            // проверяю массив на деление на 2, если остаток 0 - числов четное, иначе нечетное
            if (array[i] % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Чётных чисел: " + evenNumber);
        System.out.println("Не чётных чисел: " + oddNumber);
    }
}

