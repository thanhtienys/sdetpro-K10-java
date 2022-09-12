package src.Lesson_02;

import sun.java2d.pipe.BufferedMaskFill;

import java.util.Scanner;

public class LabCheckBMI {
    public static void main(String[] args) {

        //Input height
        Scanner scannerHeight = new Scanner(System.in);
        System.out.print("Please input your height (m) : ");
        float height = scannerHeight.nextFloat();

        //Input weight
        Scanner scannerWeight = new Scanner(System.in);
        System.out.print("Please input your weight (kg) : ");
        float weight = scannerWeight.nextFloat();

        // Calculate BMI
        float BMI = (weight / (height * 2)) ;

        //Show BMI
        System.out.printf("BMI of you is %f:", BMI);
        System.out.println("\n");

        //Classify of BMI

        if (BMI <= 18.5){
            System.out.println("You are underweight");
        }else if (BMI <= 24.9) {
            System.out.println(" You are normal weight");
        }else if (BMI <= 29.9) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obesity");
        }
    }
}
