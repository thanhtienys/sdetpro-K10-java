package src.lab_11;

import java.util.Arrays;
import java.util.List;
import src.lab_11.Animal;
import src.lab_11.AnimalRacing;

public class AnimalTest {

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();

        List<Animal> list = Arrays.asList(tiger,horse,dog);

        //Speed random of animal
        AnimalRacing.getSpeedRandom(list);

        //Get result
        System.out.println("Animal Win is: " + AnimalRacing.getResult(list));

    }

}
