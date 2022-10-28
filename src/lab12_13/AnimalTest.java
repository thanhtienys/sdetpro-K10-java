package src.lab12_13;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        Controller controller = new Controller();

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Owl owl = new Owl();

        List flyAbles = controller.flyNonAbles(Arrays.asList(dog, dog1, owl));
        System.out.println(flyAbles);
        MoveAble winner = controller.getWinner(flyAbles);
        System.out.println(winner);


    }
}
