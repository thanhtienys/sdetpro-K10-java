package src.lesson_06;

import java.util.Scanner;

public class LabCheckInputTime {

    public static void main(String[] args) {
        String myPassword = "password123";

        System.out.print("Input password: ");
        Scanner scanner = new Scanner(System.in);
        String inputPass = scanner.next();

        int timeInput = 0;
        while (timeInput <= 3){
           if (myPassword.equals(inputPass)){
               System.out.println("Password is correct!");
               break;
           } else if (timeInput == 3) {
               System.out.println("You entered wrong 3 times. \nPlease re-input after 5 minutes");
               break;
           } else {
               timeInput++;
               System.out.print("Password is wrong, please re-input your password: ");
               inputPass = scanner.next();
           }
        }
    }

}
