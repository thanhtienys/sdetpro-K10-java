package src.lesson_10;

import java.util.Arrays;
import java.util.List;

public class AnimalPatternTest {

    public static void main(String[] args) {

        AnimalPattern.Register register = new AnimalPattern.Register();
        AnimalPattern dog = register.setName("Dog").setMaxSpeed(50).build();
        AnimalPattern tiger = register.setName("Tiger").setMaxSpeed(100).build();
        AnimalPattern tiger1 = register.setName("Tiger 1").setMaxSpeed(100).build();
        AnimalPattern horse = register.setName("Horse").setMaxSpeed(75).setFly(false).build();
        AnimalPattern horse1 = register.setName("Horse 1").setMaxSpeed(75).setFly(false).build();
        AnimalPattern bird1 = register.setName("Bird 1").setMaxSpeed(30).setFly(true).build();

        List<AnimalPattern> animalList = Arrays.asList(dog, tiger, tiger1, horse, horse1, bird1);

        //Get list animal non fly and after random speed
        List<AnimalPattern> getListRacing = Controller.getFilterAnimalAndSpeed(animalList);
        //for (AnimalPattern animal : getListRacing) System.out.println(animal);

        // Show result
        System.out.println("Animal win is: " + Controller.getResult(getListRacing));
    }
}
