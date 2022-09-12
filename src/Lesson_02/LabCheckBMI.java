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
        System.out.print("\n");

        // Calculate the weight to increase
        float BMI_NORMAL_MIN = 18.6f;
        float weightNormalMin = (BMI_NORMAL_MIN * height * 2);
        float weightIncrease =(weightNormalMin - weight);

        // Calculate the weight to decrease
        float BMI_NORMAL_MAX = 24.9f;
        float weightNormalMax = (BMI_NORMAL_MAX * height * 2);
        float weightDecrease =(weight - weightNormalMax);

        //Classify of BMI
        if (BMI <= 18.5){
            System.out.println("You are underweight");
            System.out.printf("You need increase: %f kg" ,+ weightIncrease , "kg");
        }else if (BMI <= 24.9) {
            System.out.println(" You are normal weight");
        }else if (BMI <= 29.9) {
            System.out.println("You are overweight");
            System.out.printf("You need decrease: %f kg" ,+ weightDecrease , "kg");
        }else {
            System.out.println("You are obesity");
            System.out.printf("You need decrease: %f kg" ,+ weightDecrease , "kg");
        }
    }
}
