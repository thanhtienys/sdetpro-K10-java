package src.lab12_13;

import java.security.SecureRandom;

public class Dog implements FlyAble, MoveAble{

    private int speed;
    public Dog () {
        speed = new SecureRandom().nextInt(60);
    }

    @Override
    public boolean flyAble() {
        return false;
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
