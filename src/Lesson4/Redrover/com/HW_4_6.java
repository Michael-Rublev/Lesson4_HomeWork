package Lesson4.Redrover.com;

public class HW_4_6 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            // условие сравнения текущего значения в переменной min с каждым индексом массива
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
