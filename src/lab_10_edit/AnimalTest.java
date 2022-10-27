package src.lab_10_edit;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        Animal dog = new Animal.Register().setName("Dog").setFly(false).setSpeed(new SecureRandom().nextInt(60)).build();
        Animal bird = new Animal.Register().setName("Bird").setFly(true).setSpeed(new SecureRandom().nextInt(1000)).build();
        Animal tiger = new Animal.Register().setName("Tiger").setFly(false).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal horse = new Animal.Register().setName("Horse").setFly(false).setSpeed(new SecureRandom().nextInt(75)).build();
        Animal owl = new Animal.Register().setName("Owl").setFly(true).setSpeed(new SecureRandom().nextInt(75)).build();

        List<Animal> animalList = Arrays.asList(dog, bird, tiger, horse, owl);
        System.out.println(animalList);

        Animal winner = new RacingController().getWinner(animalList);
        System.out.println("The winner is : " + winner.getName());
    }

}
