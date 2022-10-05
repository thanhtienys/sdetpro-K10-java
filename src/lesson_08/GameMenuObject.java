package src.lesson_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMenuObject {

    public static List<Integer> randomList() {

        List<Integer> myList = new ArrayList<>();
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));

        return myList;
    }


    public static int getUserOption() {
        System.out.print("Enter your option:");
        return inputNumber();
    }

    public static void addNumber(List<Integer> myList) {
        System.out.print("How number you want to add:");
        int countNum = inputNumber();
        for (int i = 0; i < countNum; i++) {
            System.out.printf("Input number %d:",i);
            myList.add(inputNumber());
        }

    }

    public static int getMaxValue(List<Integer> myList) {

        int maxValue = myList.get(0);
        for (Integer value : myList) {
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int getMinValue(List<Integer> myList) {
        int minValue = myList.get(0);
        for (Integer value : myList) {
            if (value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public static boolean searchNumber(List<Integer> myList, int numberFind) {
       return myList.contains(numberFind);
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
