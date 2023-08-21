package Lesson4.Redrover.com;

public class Lesson_4 {
    public static void main(String[] args) {

        boolean itMoves = true;
        boolean shouldItMove = false;

        if (itMoves) {
            if  (shouldItMove) {
                System.out.println("No problem");
            } else {
                System.out.println("use duct tape");
            }
        } else {
            if (shouldItMove) {
                System.out.println("Use WD-40");
            } else {
                System.out.println("No problem");
            }
        }

        //Alternative version (Engineering Flowchart) Does it move?

        if (itMoves == shouldItMove){
            System.out.println("No problem");
        } else if (itMoves) {
            System.out.println("Use duct tape");
        } else {
            System.out.println("Use WD-40");
        }
    }
}
