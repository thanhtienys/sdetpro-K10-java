package src.lesson_12_has_a_relationship;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee ti = new Employee("Ti", 10);
        Employee teo = new Employee("Teo", 15);
        Employee tun = new Employee("Tun", 9);

        List<Employee> employeeList = Arrays.asList(ti,teo,tun);
        System.out.println("Before sort");
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println("After sort");
        System.out.println(employeeList);

    }
}
