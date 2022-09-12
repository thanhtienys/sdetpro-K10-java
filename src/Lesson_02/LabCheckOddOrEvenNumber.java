package src.Lesson_02;

import java.util.Scanner;

public class LabCheckOddOrEvenNumber {

    public static void main(String[] args) {

        //Input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer number you want to check: ");
        int myNum = scanner.nextInt();

        // Balance calculation
        int myRemainder = (myNum % 2);

        //Check number is odd or even
        if (myRemainder == 0) {
            System.out.print(myNum);
            System.out.print(" is even number");
        }else {
            System.out.print(myNum);
            System.out.print(" is odd number");
        }

    }
}
