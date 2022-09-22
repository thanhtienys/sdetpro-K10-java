package src.Lession_03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LabSortArrayNumber {

    public static void main(String[] args) {

        //Input length array
        int length;
        do{
            System.out.print("Input length of array:");
            Scanner scanner = new Scanner(System.in);
            length = scanner.nextInt();
        }while (length <= 0);

        //Create array number random
        System.out.println("My array number random is:");
        int [] arrNum = new int[length];
        for (int i = 0; i < length; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            arrNum[i] = randomNumber;
        }
        System.out.println(Arrays.toString(arrNum));

        //Sort array number
        int varTemporary;
        for (int i = 0; i < (length - 1); i++) {
            for (int j = (i+1) ; j < length; j++) {
                if (arrNum[i] > arrNum[j]) {
                    varTemporary = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = varTemporary;
                }
            }

        }
        //Display array number after sorted
        System.out.println("\n My array after sorted:");
        System.out.println(Arrays.toString(arrNum));
    }
}
