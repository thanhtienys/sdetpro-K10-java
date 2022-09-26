package src.lesson_02;

import java.sql.SQLOutput;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        //Right operand
        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        // Total is %d
        // "\n" to down line
        System.out.printf("Total is %d", total);

        System.out.printf("Boolean value is %b\n", true);
        System.out.printf("Character is %s", 'a');

        float myFloatNum = 3/2f;
        System.out.println(myFloatNum);

        //Chia lấy phần nguyên
        System.out.println(5 / 2);
        //Chia lấy phần dư
        System.out.println(5 % 2);

    }
}
