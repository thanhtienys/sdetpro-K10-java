package src.lab12_13;

public class Dog implements FlyAble, MoveAble{
    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {
        return 60;
    }

    @Override
    public String toString() {
        return flyAble() + " " + speed();
    }
}
