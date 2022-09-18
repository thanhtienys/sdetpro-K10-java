package src.Lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class LabFindMaxMinNumber {

    public static void main(String[] args) {
        //Input length of array
        int lengthArr;
        do{
            System.out.print("Input length of array:");
            Scanner scanner = new Scanner(System.in);
            lengthArr = scanner.nextInt();
        }while (lengthArr <= 0);

        //Create and display array number radom
        System.out.println("My array number radom is:");
        int [] arrNum = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            arrNum[i] = randomNumber;
            System.out.printf("   %d", arrNum[i]);
        }
        //Method 1:
        // Create value max min first time
        int max = arrNum[0];
        int min = arrNum [0];

        //Find max min number
        for (int i = 1; i < lengthArr; i++) {
            if (max < arrNum[i]) {
                max = arrNum[i];
            }
            if (min > arrNum[i]) {
                min = arrNum[i];
            }
        }

        /*
        //Method 2:
        //Sort array from min to max
        int varTemporary;
        for (int i = 0; i < (lengthArr - 1) ; i++) {
            for (int j = (i + 1); j < lengthArr; j++) {
                if (arrNum[i] > arrNum [j]){
                    varTemporary = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = varTemporary;
                }
            }
        }
        System.out.printf("\n Max number is: %d",arrNum[lengthArr-1]);
        System.out.printf("\n Min number is: %d",arrNum[0]);
        */

        System.out.printf("\n Max number is: %d",max);
        System.out.printf("\n Min number is: %d",min);
    }
}
