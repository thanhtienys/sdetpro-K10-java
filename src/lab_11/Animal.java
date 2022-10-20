package src.lab_11;

public abstract class Animal {

    public abstract String getName();

    public abstract int getMaxSpeed();

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

