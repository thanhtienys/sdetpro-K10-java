package src.Lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class LabCountOddEvenNumbers {

    public static void main(String[] args) {

        final int ARR_LENGTH = 10;
        int countEven = 0;
        int countOdd = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input length of array, you want: ");
            int lengthArr = scanner.nextInt();
        } while (lengthArr<0)
        int [] arrNum = new int[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) {

            int randomNumber = new SecureRandom().nextInt(10);
            arrNum[i] = randomNumber;
        }
        //Display array number after random
        for (int i = 0; i < ARR_LENGTH; i++) {
            System.out.printf("  %d", arrNum[i]);
        }
         //Check odd or even number
        for (int i = 0; i < ARR_LENGTH; i++) {

            int myRemainder =  (arrNum[i] % 2);

            if ((myRemainder == 0) || (arrNum[i] == 0)) {
                countEven++;
            } else{
                countOdd++;
            }
        }
        System.out.printf("\n Sum of even number is: %d " , countEven);
        System.out.printf("\n Sum of odd number is: %d " , countOdd);

    }
}
