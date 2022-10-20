package src.lab_11;

public class Dog extends Animal{
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getMaxSpeed() {
        return 60;
    }
}
