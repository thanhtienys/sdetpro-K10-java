package src.lesson_09;

import src.lesson_10.AnimalPattern;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public List getListRacing  (List<Animal> animalList){

        List<String> getListRacing = new ArrayList<>();

        for (Animal animal : animalList) {
            getListRacing.add(animal.getName() + " speed is: " + getSpeed(animal.getMaxSpeed()));
        }
        return getListRacing;
    }

    public List getListRacingFilterFly (List<AnimalPattern> animalList){

        List<String> getListRacingFilterFly = new ArrayList<>();

        for (AnimalPattern animalPattern : animalList) {
            if (!animalPattern.isFly()) {
                getListRacingFilterFly.add(animalPattern.getName() + " speed is: " + getSpeed(animalPattern.getMaxSpeed()));
            }
        }
        return getListRacingFilterFly;
    }

    public String getResult(List<String> getListRacing){

        //String animal = ;
        String speed = getListRacing.get(0);
        speed = speed.substring(speed.lastIndexOf(":"));
        speed = speed.replaceAll("[^0-9]","");

        int maxValue = Integer.parseInt(speed);
        int postion = 0;

        for (int i = 0; i < getListRacing.size(); i++) {
            String speedONFor = getListRacing.get(i);
            speedONFor = speedONFor.substring(speedONFor.lastIndexOf(":"));
            speedONFor = speedONFor.replaceAll("[^0-9]","");

            int speedCompare = Integer.parseInt(speedONFor);
            if (maxValue < speedCompare) {
                maxValue = speedCompare;
                postion = i;
            }
        }
        return getListRacing.get(postion).substring(0,getListRacing.get(postion).indexOf("speed"));
    }

    private int getSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
