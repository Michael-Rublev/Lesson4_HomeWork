package Lesson4.Redrover.com;

import java.util.Arrays;

public class Lesson_4_1_2_array {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 5, 3, 2, 4, 5, 4, 3, 3, 4};

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i = i + 1) {
            int elem = arr[i];
            result[i] = elem * elem;
        }
        System.out.println(Arrays.toString(result));
    }
}
