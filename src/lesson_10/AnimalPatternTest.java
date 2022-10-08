package src.lesson_10;

import src.lesson_09.AnimalController;

import java.util.Arrays;
import java.util.List;

public class AnimalPatternTest {

    public static void main(String[] args) {
        AnimalPattern.RegisterRacing registerRacing = new AnimalPattern.RegisterRacing();
        AnimalPattern dog = registerRacing.setName("Dog").setMaxSpeed(50).build();
        AnimalPattern tiger = registerRacing.setName("Tiger").setMaxSpeed(100).build();
        AnimalPattern tiger1 = registerRacing.setName("Tiger 1").setMaxSpeed(100).build();
        AnimalPattern horse = registerRacing.setName("Horse").setMaxSpeed(75).setFly(false).build();
        AnimalPattern horse1 = registerRacing.setName("Horse 1").setMaxSpeed(75).setFly(false).build();
        AnimalPattern bird1 = registerRacing.setName("Bird 1").setMaxSpeed(30).setFly(true).build();
        AnimalPattern bird2 = registerRacing.setName("Bird 2").setMaxSpeed(45).setFly(true).build();
        AnimalPattern bird3 = registerRacing.setName("Bird 3").setMaxSpeed(50).setFly(true).build();
        List<AnimalPattern> animalList = Arrays.asList(dog, tiger, tiger1, horse, horse1, bird1, bird2, bird3);

        List<String> getListRacing = new AnimalController().getListRacingFilterFly(animalList);
        System.out.println(getListRacing);

        String result = new AnimalController().getResult(getListRacing);
        System.out.println("Animal win is: " + result);
    }
}
