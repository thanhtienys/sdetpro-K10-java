package src.lab_10_edit;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public Animal getWinner(List<Animal> list){

        Animal winner = list.get(0);
        for (Animal animal : list) {
            if(animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
    return winner;
    }

    private List<Animal> getOutFly(List<Animal> list){

        List<Animal> getOutFlyList = new ArrayList<>();
        for (Animal animal : list) {
            if(!animal.isFly()){
                getOutFlyList.add(animal);
            }
        }
        return getOutFlyList;

    }


}
