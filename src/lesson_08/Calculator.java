package src.lesson_08;

public class Calculator {

    //Overloading : Same class, same name method BUT difference parameter : parameter number or parameter type, complete time
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int sum(int... nums){
        int total = 0;
        for (int num : nums) {
            total += num;
            //2nd
            //total = total+num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(4, 6));
        System.out.println(Calculator.sum(1, 2, 3));
        System.out.println(Calculator.sum(1, 2, 3,4,5,6,6));
    }
}
