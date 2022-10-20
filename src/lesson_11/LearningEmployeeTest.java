package src.lesson_11;

import java.util.Arrays;
import java.util.List;

public class LearningEmployeeTest {

    public static void main(String[] args) {

        //Form up data from objects
        LearningEmployee NguyenVanA = new LearningEmployeeFullTime();
        LearningEmployee NguyenVanB = new LearningEmployeeContract();

        List<LearningEmployee> learningEmployeeList = Arrays.asList(NguyenVanA, NguyenVanB);

        //Calling controller to process data
        int totalSalary = new LearningEmployeeController().calculateTotalSalary(learningEmployeeList);
        System.out.println("Total is: " + totalSalary);


    }
}
