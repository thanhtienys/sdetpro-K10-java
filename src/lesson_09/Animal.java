package src.lesson_09;

public class Animal {

    private String name;
    private int speed;

    private int maxSpeed;

    public String getName(){
        return name;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
