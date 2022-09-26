package src.lesson_04;

import java.util.Scanner;

public class LearnSwitchCaseStatement {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        //1st approach
        if (userInput == 1){
            System.out.println("Giai nhat!");
        } else if (userInput == 2){
            System.out.println("Giai nhi!");
        } else if (userInput == 3){
            System.out.println("Giai ba!");
        } else {
            System.out.println("Nhap sai roi");
        }

        //2nd SwitchCase

        switch (userInput){
            case 1:
                //Bao nhiu dong cung duoc, khong can phai de trong {}
                System.out.println("Giai nhat");
                System.out.println("Chuc mung ban");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Nhap sai roi");
        }

        //Ex break
        switch (userInput){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays!");
                break;
            case 7:
            case 8:
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Wrong");
        }

    }
}
