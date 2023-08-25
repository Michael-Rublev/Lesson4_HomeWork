package Lesson4.Redrover.com;

public class HW_4_7 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int midle = (int) (sum / array.length);
        System.out.println(sum);
    }
}
