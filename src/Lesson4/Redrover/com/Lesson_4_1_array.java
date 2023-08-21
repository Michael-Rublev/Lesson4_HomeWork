package Lesson4.Redrover.com;

import java.util.Arrays;

public class Lesson_4_1_array {
    public static void main(String[] args) {

        // Отсчет длины ячеек начинается с 0 и далее 1,2,3,4,5,6,7,8,9 и т.д.

        //Удобный вариант иниуиализации массива
        int[] scoreMarks = new int[]{5, 5, 3, 2, 4, 5, 4, 3, 3, 4, 2};

        int sum = 0;
        for (int i = 0; i < scoreMarks.length; i = i + 1) {
            sum = sum + scoreMarks[i];
        }
        System.out.println(sum * 1.0 / scoreMarks.length);
    }
    // Правильный вариант инициализации массива, значение по умолчанию 0
//        int[] scoreMarks1 = new int[10];
//        scoreMarks1[0] = 5;
//        scoreMarks1[1] = 3;
//        scoreMarks1[2] = 23;
//        scoreMarks1[3] = 25;
//        scoreMarks1[4] = 2;

    // в примере мы выводим какие данные лежат в ячейке под номером  [номер ячейки]
    //System.out.println(scoreMarks[1]);

    //в данном примере мы заменяем данные в массиве на наши
//        scoreMarks[6] = 4;
//        scoreMarks[7] = 4;
        /*вывод массива через Arrays.toString() приводит массив в строку,
        что выдает нам значение самого массива в нашей программе*/
//        System.out.println(Arrays.toString(scoreMarks));
//

}
