package src.lab_11;

import src.lab_11.Animal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    
    public static void getSpeedRandom(List<Animal> list){
        for (Animal animal : list) {
            int speedRandom = new SecureRandom().nextInt(animal.getMaxSpeed());
            animal.setSpeed(speedRandom);
            System.out.println("Speed of " + animal.getName() + " is " + animal.getSpeed());
        }
    }

    public static String getResult(List<Animal> list){
        int speed = list.get(0).getSpeed();
        String name = list.get(0).getName();
        for (Animal animal : list) {
            if (speed < animal.getSpeed()){
                speed = animal.getSpeed();
                name = animal.getName();
            }
        }
        return name;
    }
}
