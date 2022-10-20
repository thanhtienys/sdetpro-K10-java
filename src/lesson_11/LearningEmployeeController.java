package src.lesson_11;

import java.util.List;

public class LearningEmployeeController {

    public int calculateTotalSalary(List<LearningEmployee> learningEmployeeList){

        int totalSalary = 0;
        for (LearningEmployee learningEmployee : learningEmployeeList) {
            if (learningEmployee instanceof LearningEmployeeFullTime){
                //Casting
                LearningEmployeeFullTime employeeFullTime = (LearningEmployeeFullTime) learningEmployee;
                totalSalary = totalSalary + learningEmployee.getSalary() + employeeFullTime.getSupportMoney();
            } else {
                totalSalary += learningEmployee.getSalary();
            }
        }
        return totalSalary;

    }
}
/*
I. Casting | chỉ sử dụng khi không thể sửa đổi model của Employee
--> break is relationship
2 cách khai bảo method mới
1st
employee = (EmployeeFullTime) employee;

2nd
EmployeeFullTime employeeFullTime = (EmployeeFullTime) employee;

II. Thay đổi Employee : tạo thêm 1 method getSuportMoney return 0;
*/
