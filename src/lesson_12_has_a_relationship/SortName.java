package src.lesson_12_has_a_relationship;

import java.util.Comparator;

public class SortName implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareToIgnoreCase(emp2.getName());
    }
}
