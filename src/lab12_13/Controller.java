package src.lab12_13;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public List<FlyAble> flyNonAbles (List<FlyAble> flyAbleList){

        List<FlyAble> flyNonAbles = new ArrayList<>();
        for (FlyAble animal : flyAbleList) {
            if(!animal.flyAble()){
                flyNonAbles.add(animal);
            }
        }
        return flyNonAbles;
    }

    public MoveAble getWinner (List<MoveAble> moveAbleList){

        MoveAble winner = moveAbleList.get(0);
        for (MoveAble animal : moveAbleList) {
            if(animal.speed() > winner.speed()){
                winner = animal;
            }
        }
        return winner;
    }
}
