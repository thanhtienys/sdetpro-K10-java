package src.lesson_10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static List getFilterAnimalAndSpeed(List<AnimalPattern> list){
        List<AnimalPattern> animalList = new ArrayList<>();
        int speed;
        for (AnimalPattern animal : list) {
            if (!animal.isFly() && animal.getMaxSpeed()!=0){
                speed = new SecureRandom().nextInt(animal.getMaxSpeed());
                animalList.add(new AnimalPattern.Register().setName(animal.getName()).setSpeedRacing(speed).build());
            }
        }
        return animalList;
    }

    public static String getResult(List<AnimalPattern> list){

        int maxSpeed = list.get(0).getSpeedRacing();
        String animalWin = list.get(0).getName();

        for (AnimalPattern animal : list) {
            if (maxSpeed < animal.getSpeedRacing()){
                maxSpeed = animal.getSpeedRacing();
                animalWin = animal.getName();
            }
        }
        return  animalWin;
    }
}
