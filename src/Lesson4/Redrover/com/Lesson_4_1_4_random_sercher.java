package Lesson4.Redrover.com;

public class Lesson_4_1_4_random_sercher {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int myNum = 92;

        int guess;

        do {
            guess = (min + max) / 2;
            System.out.print("I'm guessing ");
            System.out.println(guess);

            if (guess < myNum) {
                min = guess;
            } else {
                max = guess;
            }
        } while (guess != myNum);
    }
}