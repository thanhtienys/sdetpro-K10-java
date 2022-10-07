package src.lesson_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Form up data from objects
        Employee NguyenVanA = new EmployeeFullTime();
        Employee NguyenVanB = new EmployeeFullTime();
        Employee NguyenVanC = new EmployeeContract();
        Employee NguyenVanD = new EmployeeContract();

        List<Employee> employeeList = Arrays.asList(NguyenVanA, NguyenVanB, NguyenVanC, NguyenVanD);

        //Calling controller to process data
        int totalSalary = new EmployeeController().calculateTotalSalary(employeeList);
        System.out.println(totalSalary);


    }
}
