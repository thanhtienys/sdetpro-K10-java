package src.lesson_11_abstraction;

import java.util.List;

public class LearningEmployeeController {

    public int calculateTotalSalary(List<LearningEmployee> learningEmployeeList){

        int totalSalary = 0;
        for (LearningEmployee learningEmployee : learningEmployeeList) {
                totalSalary = totalSalary + learningEmployee.getSalary() + learningEmployee.getSuportMoney();
            }
        return totalSalary;

    }
}
