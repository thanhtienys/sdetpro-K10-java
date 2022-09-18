package src.Lession_03;

import javax.swing.plaf.IconUIResource;
import java.security.SecureRandom;
import java.util.Scanner;

public class LabMerge2SortedArray {

    public static void main(String[] args) {

        //Create length of 2 arrays
        int length1;
        int length2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of array 1: ");
        length1 = scanner.nextInt();
        System.out.print("Input length of array 2: ");
        length2 = scanner.nextInt();

        while ((length1 <= 0) || (length2 <= 0)){
            if ((length1 <= 0) && (length2 <= 0)) {
                System.out.println("Please input length of array 1 and 2 with value more than 0! ");
                System.out.print("Array 1: ");
                length1 = scanner.nextInt();
                System.out.print("Array 2: ");
                length2 = scanner.nextInt();
            }else if (length1 <= 0) {
                System.out.print("Please input length of array 1 with value more than 0: ");
                length1 = scanner.nextInt();
            } else {
                System.out.print("Please input length of array 2 with value more than 0: ");
                length2 = scanner.nextInt();
            }
        }

        //Create array1
        int[] arrNum1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            int randomNumber = new SecureRandom().nextInt(100);
            arrNum1[i]= randomNumber;
        }
        //Sort array1
        int varTempo1;
        for (int i = 0; i < (length1 - 1); i++) {
            for (int j = (i + 1); j < length1; j++) {
                if (arrNum1[i] > arrNum1[j]){
                    varTempo1 = arrNum1[i];
                    arrNum1[i] = arrNum1[j];
                    arrNum1[j] = varTempo1;
                }
            }

        }
        //Display array1 after sorted
        System.out.println("Array number 1 is: ");
        for (int i = 0; i < length1; i++) {
            System.out.printf("   %d", arrNum1[i]);
        }

        //Create array2
        int[] arrNum2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            int randomNumber = new SecureRandom().nextInt(100);
            arrNum2[i]= randomNumber;
        }
        //Sort array2
        int varTempo2;
        for (int i = 0; i < (length2 - 1); i++) {
            for (int j = (i + 1); j < length2; j++) {
                if (arrNum2[i] > arrNum2[j]){
                    varTempo2 = arrNum2[i];
                    arrNum2[i] = arrNum2[j];
                    arrNum2[j] = varTempo2;
                }
            }

        }
        //Display array2 after sorted
        System.out.println("\nArray number 2 is: ");
        for (int i = 0; i < length2; i++) {
            System.out.printf("   %d", arrNum2[i]);
        }

        //Merge 2 arrays into array3
        int [] arrNum3 = new int[length1 + length2];
        int locationArr1 = 0 ; int locationArr2 = 0 ; int locationArr3 = 0 ;
        while ((locationArr1 < length1) && (locationArr2 < length2)){
            if (arrNum1[locationArr1] < arrNum2[locationArr2]){
                arrNum3[locationArr3++] = arrNum1[locationArr1];
                locationArr1++;
            }else {
                arrNum3[locationArr3++] = arrNum2[locationArr2];
                locationArr2++;
            }
        }
        //Add the remaining values of the array1 into array3
        while (locationArr1 < length1){
            arrNum3[locationArr3++] = arrNum1[locationArr1++];
        }
        //Add the remaining values of the array2 into array3
        while (locationArr2 < length2){
            arrNum3[locationArr3++] = arrNum2[locationArr2++];
        }

        //Display array3
        System.out.println("\nArray number 3 after merge 2 array sorted:");
        for (int i = 0; i < (length1 + length2); i++) {
            System.out.printf("  %d", arrNum3[i]);
        }

    }
}
