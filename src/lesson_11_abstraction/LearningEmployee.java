package src.lesson_11_abstraction;

public abstract class LearningEmployee {

    private String name;
    private int salary;

    // Method trù tượng, không có detail {}.
    public abstract int getSalary();
    public abstract int getSuportMoney();

    // method abstract phải nằm trong abstract class. Nhưng abstract class có thể chưa method abstract hoặc không
    public String getName() {
        return name;
    }
}
