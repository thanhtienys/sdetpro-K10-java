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

        List<Animal> animalList = Arrays.asList(tiger, dog, dog2, dog3, horse, horse1);

        //List Racing
        List<String> listRacing = new AnimalController().getListRacing(animalList);
        System.out.println("List Name and speed of animal join to speed: ");
        System.out.println(listRacing);

        String result = new AnimalController().getResult(listRacing);

        System.out.println("Animal win is : " + result);
    }
}
