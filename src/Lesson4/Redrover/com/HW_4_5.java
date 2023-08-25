package Lesson4.Redrover.com;

public class HW_4_5 {
    public static void main(String[] args) {

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        //Переменная куда мы запишем максимальное значение
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            // условие сравнения текущего значения в переменной max
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
