package src.lesson_04;

import java.security.SecureRandom;

public class LearningFunction {

    public static void main(String[] args) {
        printARandomNumber();
    }

    // Access Modifier | class method | returned type
    public static void printARandomNumber(){

        System.out.println(new SecureRandom().nextInt(1000));
    }
}

/*
-> Goi function co truyen paramater
    public static void main(String[] args) {
        // 2 | Agrument;
        printARandomNumber(2);
    }
    // inputNumber | Parameter
    public static void printARandomNumber (int inputNumber){
        System.out.println(inputNumber);
    }
    // truyen nhieu Parameter
    // inputNumber | Parameter
    public static void printARandomNumber (int inputNumber , int seconNumber){
        System.out.println(inputNumber);
    }

 */

