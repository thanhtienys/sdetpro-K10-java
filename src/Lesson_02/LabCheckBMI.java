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

        //Show calculate result  BMI
        System.out.printf("BMI of you is %f:", BMI);
        System.out.print("\n");

        float weightStandard;
        float weightIncrease;
        float weightDecrease;
        //Value min of classify "Normal Weight"
        float BMI_NORMAL_MIN = 18.6f;
        //Value max of classify "Normal Weight"
        float BMI_NORMAL_MAX = 24.9f;
        //Value max of classify "Overweight"
        float MBI_OVERWEIGHT_MAX = 29.9f;

        //Classify of BMI
        if (BMI <= 18.5){
            System.out.println("You are underweight");
                weightStandard = (BMI_NORMAL_MIN * height * 2);
                weightIncrease = (weightStandard - weight );
            System.out.printf("You need increase: %f kg to become normal weight " ,+ weightIncrease );
        }else if (BMI <= 24.9) {
            System.out.println(" You are normal weight");
        }else if (BMI <= 29.9) {
            System.out.println("You are overweight");
                weightStandard = (BMI_NORMAL_MAX * height * 2);
                weightDecrease = ( weight- weightStandard );
            System.out.printf("You need decrease: %f kg to get back normal weight " ,+ weightDecrease );
        }else {
            System.out.println("You are obesity");
                weightStandard = (MBI_OVERWEIGHT_MAX * height * 2);
                weightDecrease = ( weight- weightStandard );
            System.out.printf("You need decrease: %f kg to get back overweight" ,+ weightDecrease );
        }
    }
}
