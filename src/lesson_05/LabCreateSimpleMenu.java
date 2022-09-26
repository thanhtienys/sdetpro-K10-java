package src.lesson_05;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabCreateSimpleMenu {

    public static void main(String[] args) {

        //Create a list number
        List<Integer> myList = new ArrayList<>();
            myList.add(new SecureRandom().nextInt(1000));
            myList.add(new SecureRandom().nextInt(1000));
            myList.add(new SecureRandom().nextInt(1000));
            myList.add(new SecureRandom().nextInt(1000));
            myList.add(new SecureRandom().nextInt(1000));
            myList.add(new SecureRandom().nextInt(1000));
        System.out.println("My list is:" +myList);

        //Create Menu
        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");

        //Input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a choice: ");
        int numMenu = scanner.nextInt();

        switch (numMenu) {
            case 1:
                System.out.print("Input position of number want add into list: ");
                int position = scanner.nextInt();
                while (position > myList.size()) {
                    System.out.printf("Please input position less than or equal %d: ", myList.size());
                    position = scanner.nextInt();
                }
                System.out.print("\nInput number want add into list: ");
                int numAdd = scanner.nextInt();
                myList.add(position, numAdd);
                System.out.println("List after add: " + myList);
                break;
            case 2:
                System.out.println("List is" + myList);
                break;
            case 3:
                int maxNum = myList.get(0);
                for (int i = 1; i < myList.size(); i++) {
                    if (maxNum < myList.get(i)) {
                        maxNum = myList.get(i);
                    }
                }
                System.out.println("Maximum number is: " + maxNum);
                break;
            case 4:
                int minNum = myList.get(0);
                for (int i = 1; i < myList.size(); i++) {
                    if (minNum > myList.get(i)) {
                        minNum = myList.get(i);
                    }
                }
                System.out.println("Maximum number is: " + minNum);
                break;
            case 5:
                System.out.println("Input number need to find: ");
                int numFind = scanner.nextInt();
                if (myList.contains(numFind)) {
                    System.out.println("Position of number in list is: " + myList.indexOf(numFind));
                } else {
                    System.out.println("Number not exist in list");
                }
                break;
            default:
                System.out.println("Number has not in Menu");
                break;
        }
    }
}


