package src.lesson_08;

import java.util.List;

public class GameMenuMain {

    public static void main(String[] args) {

        List<Integer> myList = GameMenuObject.randomList();

        printMenuGame();

        boolean isContinue = true;

        while (isContinue){

            int userOption = GameMenuObject.getUserOption();

            switch (userOption){
                case 0:
                    isContinue = false;
                    break;
                case 1:
                    GameMenuObject.addNumber(myList);
                    break;
                case 2:
                    printNumber(myList);
                    break;
                case 3:
                    System.out.println("Max value is: " + GameMenuObject.getMaxValue(myList));
                    break;
                case 4:
                    System.out.println("Min value is: " + GameMenuObject.getMinValue(myList));
                    break;
                case 5:
                    System.out.print("Input number you want to find: ");
                        int numberFind = GameMenuObject.inputNumber();

                    boolean result = GameMenuObject.searchNumber(myList,numberFind);

                    if (result) {
                        System.out.println("Number exits in list");
                    } else {
                        System.out.println("Number not exist in list");
                    }
                    break;
                default:
                    System.out.println("Option is wrong!!!!");
            }
        }
    }

    private static void printNumber(List<Integer> myList) {
       System.out.println(myList);
    }

    public static void printMenuGame() {

        System.out.println("=====MENU======");
        System.out.println("0. Out game");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
    }
}
