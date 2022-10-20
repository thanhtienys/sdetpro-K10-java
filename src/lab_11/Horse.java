package src.lab_11;

public class Horse extends Animal{
    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getMaxSpeed() {
        return 75;
    }
}
