package src.lesson_09;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        Animal tiger = new AnimalTiger();
        Animal dog = new AnimalDog();
        Animal dog2 = new AnimalDog();
        Animal dog3 = new AnimalDog();
        Animal horse = new AnimalHorse();
        Animal horse1 = new AnimalHorse();

        //Add list animal
        List<Animal> animalList = Arrays.asList(tiger, dog, dog2, dog3, horse, horse1);

        //Get list animal with speed
        List<Animal> listSpeedAnimal = AnimalController.getListSpeedAnimal(animalList);

        // Get result
        System.out.println("Win is : " + AnimalController.getResult(listSpeedAnimal));
    }
}
