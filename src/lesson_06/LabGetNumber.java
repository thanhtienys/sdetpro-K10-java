package src.lesson_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LabGetNumber {

    public static void main(String[] args) {

        System.out.print("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.next();

        char[] strToChar = myStr.toCharArray();
        String myNumber="";

        for (char myChar : strToChar) {
            if (Character.isDigit(myChar) == true){
                myNumber = myNumber.concat(String.valueOf(myChar));
            }
        }
        System.out.print("Number on a string is:" + myNumber);

    }
}
