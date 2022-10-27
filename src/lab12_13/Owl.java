package src.lab12_13;

public class Owl implements FlyAble, MoveAble{
    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int speed() {
        return 45;
    }

    @Override
    public String toString() {
        return flyAble() + " " + speed();
    }
}
