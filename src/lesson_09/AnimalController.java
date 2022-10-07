package src.lesson_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {


    public List getListRacing  (List<Animal> animalList){

        List<String> getListRacing = new ArrayList<>();

        for (int i = 0; i < animalList.size(); i++) {
            getListRacing.add(animalList.get(i).getName() +" "+ getSpeed(animalList.get(i).getMaxSpeed()));
        }
        return getListRacing;
    }

    public String getResul(List<String> getListRacing){

        //String animal = ;
        String speed = getListRacing.get(0).trim();
        speed = speed.replaceAll("[^0-9]","");

        int maxValue = Integer.parseInt(speed);
        int postion = 0;

        for (int i = 0; i < getListRacing.size(); i++) {
            String speedfor = getListRacing.get(i).trim();
            speedfor = speedfor.replaceAll("[^0-9]","");
            int speedCompare = Integer.parseInt(speedfor);
            if (maxValue < speedCompare) {
                maxValue = speedCompare;
                postion = i;
            }

        }
        String result = getListRacing.get(postion);
        return result;
    }

    private int getSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
