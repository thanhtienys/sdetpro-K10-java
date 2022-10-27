package src.lab_10_edit;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    private List<Animal> getOutFly(List<Animal> list){

        List<Animal> getOutFlyList = new ArrayList<>();
        for (Animal animal : list) {
            if(!animal.isFly()){
                getOutFlyList.add(animal);
            }
        }
        return getOutFlyList;

    }

    public Animal getWinner(List<Animal> list){

        List<Animal> getOutFlyList = getOutFly(list);

        Animal winner = list.get(0);
        for (Animal animal : getOutFlyList) {
            if(animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
    return winner;
    }


}
