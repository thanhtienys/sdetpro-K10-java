package src.lesson_07;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMenu {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));
        myList.add(new SecureRandom().nextInt(1000));

        printGameMenu();

        boolean isContinuing = true;
    while (isContinuing){

        int option = getUserOption();

        switch (option){
            case 0:
                isContinuing = false;
                break;
            case 1:
                addNumber(myList);
                break;
            case 2:
                printArrayList(myList);
                break;
            case 3:
                int maxValue = getMaxValue(myList);
                System.out.println("Maximum number is: " + maxValue);
                break;
            case 4:
                int minValue = getMinValue(myList);
                System.out.println("Mininum number is: " + minValue);
                break;
            case 5:
                boolean result = false;
                result = findNumber(myList);
                if (result) {
                    System.out.println("Number exitst in list");
                } else {
                    System.out.println("Number not exist in list");
                }
                break;
            default:
                System.out.println("Wrong option!!!");

        }
    }


    }

    private static boolean findNumber(List<Integer> myList) {
        boolean  result = false;
        System.out.println("Input number need to find: ");
        Scanner scanner = new Scanner(System.in);
        int numFind = scanner.nextInt();
        if (myList.contains(numFind)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static int getMinValue(List<Integer> myList) {
        int minNum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (minNum > myList.get(i)) {
                minNum = myList.get(i);
            }
        }
        return minNum;

    }

    private static int getMaxValue(List<Integer> myList) {
        int maxNum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (maxNum < myList.get(i)) {
                maxNum = myList.get(i);
            }
        }
        return maxNum;
    }

    private static void printArrayList(List<Integer> myList) {
        System.out.println("List number is: ");
        System.out.println(myList);
    }

    private static void addNumber(List<Integer> myList) {
        System.out.println("Input Number you want to add to the list:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        myList.add(number);
    }

    private static int getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;

        /*
        * cach 2
        * return scanner.nextInt();
        * */
    }

    private static void printGameMenu() {
        System.out.println("=====MENU======");
        System.out.println("0. Out game");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
    }

}
