package src.lesson_11_abstraction;

import src.lesson_11_abstraction.LearningEmployee;
import src.lesson_11_abstraction.LearningEContract;
import src.lesson_11_abstraction.LearningEmployeeController;
import src.lesson_11_abstraction.LearningEFT;

import java.util.Arrays;
import java.util.List;

public class LearningEmployeeTest {

    public static void main(String[] args) {

        //Form up data from objects
        LearningEmployee NguyenVanA = new LearningEFT();
        LearningEmployee NguyenVanB = new LearningEContract();

        List<LearningEmployee> learningEmployeeList = Arrays.asList(NguyenVanA, NguyenVanB);

        //Calling controller to process data
        int totalSalary = new LearningEmployeeController().calculateTotalSalary(learningEmployeeList);
        System.out.println("Total is: " + totalSalary);


    }
}
