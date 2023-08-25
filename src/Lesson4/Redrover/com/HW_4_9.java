package Lesson4.Redrover.com;

import java.util.Arrays;

public class HW_4_9 {
    public static void main(String[] args) {
//       проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так,
//       что каждое следующее число больше предыдущего.

        int[] array = new int[]{3, 2, 1, 4, 6, 7, 5, 8, 9};

        // метод сортировки массива
        Arrays.sort(array);
        // фор перебирает наш массив, i с 0 индекса идет по массиву,

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
