package src.lesson_12_has_a_relationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee ti = new Employee("Ti", 10, 19);
        Employee teo = new Employee("Tzeo", 15, 20);
        Employee tun = new Employee("Tun", 9, 20);

        List<Employee> employeeList = Arrays.asList(ti,teo,tun);
        System.out.println("Before sort");
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println("After sort");
        System.out.println(employeeList);

        System.out.println("Sort Age");
        employeeList.sort(new SortAge());
        System.out.println(employeeList);

        System.out.println("Sort Name");
        employeeList.sort(new SortName());
        System.out.println(employeeList);

    }
}
