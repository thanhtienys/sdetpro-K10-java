package src.Lession_03;

import javafx.scene.Scene;

import java.security.SecureRandom;
import java.util.Scanner;

public class LabCountEvenOddNumber {

    public static void main(String[] args) {

        //Input length of array
        int lengthArr;
        do {
            System.out.print("Input length array: ");
            Scanner scanner = new Scanner(System.in);
            lengthArr = scanner.nextInt();
        }while( lengthArr <= 0 );

        //Create array number random
        int[] arrNum = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            int radomNumber = new SecureRandom().nextInt(1000);
            arrNum[i] = radomNumber;
        }

        //Display array number random
        System.out.println("My array number is: ");
        for (int i = 0; i < lengthArr; i++) {
            System.out.printf("   %d", arrNum[i]);
        }

        //Count Even Odd number
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < lengthArr; i++) {
            if ((arrNum[i] % 2) == 0) {
                countEven++;
            }else{
                countOdd++;
            }
        }

        //Print result
        System.out.printf("\n Sum of even number is: %d", countEven);
        System.out.printf("\n Sum of odd number is: %d", countOdd);
    }
}
