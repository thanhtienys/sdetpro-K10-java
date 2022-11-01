package src.lab_12_13;

import java.security.SecureRandom;

public class Owl implements FlyAble, MoveAble{

    private int speed;
    public Owl () {
        speed = new SecureRandom().nextInt(60);
    }
    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return flyAble() + " " + speed();
    }
}
