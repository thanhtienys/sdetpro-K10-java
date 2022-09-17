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

        //Create array number radom
        int [] arrNum = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            arrNum[i] = randomNumber;
        }

        // Create value max min first time
        int max = arrNum[0];
        int min = arrNum [0];
        //Display array number random
        System.out.println("My array number radom is:");
        for (int i = 1; i < lengthArr; i++) {
            System.out.printf("   %d", arrNum[i]);
            //Find max min number
            if (max < arrNum[i]) {
                max = arrNum[i];
            }
            if (min > arrNum[i]) {
                min = arrNum[i];
            }
        }
        System.out.printf("\n Max number is: %d",max);
        System.out.printf("\n Min number is: %d",min);
    }
}
