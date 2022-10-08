package src.lesson_10;

public class AnimalPattern {
    private String name;
    private int maxSpeed;

    private int speedRacing;
    private boolean fly;

    public String getName() {
        return this.name;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean isFly() {
        return this.fly;
    }

    public int getSpeedRacing() {
        return speedRacing;
    }

    @Override
    public String toString() {
        return "AnimalPattern{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speedRacing=" + speedRacing +
                ", fly=" + fly +
                '}';
    }

    private AnimalPattern (Register register) {
        this.name = register.name;
        this.maxSpeed = register.maxSpeed;
        this.fly = register.fly;
        this.speedRacing = register.speedRacing;
    }

    public static class Register {
        private String name;
        private int maxSpeed;
        private boolean fly;
        private int speedRacing;

        public Register() {
        }

        public Register setSpeedRacing(int speedRacing) {
            this.speedRacing = speedRacing;
            return this;
        }

        public Register setName(String name) {
            this.name = name;
            return this;
        }

        public Register setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Register setFly(boolean fly) {
            this.fly = fly;
            return this;
        }

        public AnimalPattern build() {
            return new AnimalPattern(this);
        }
    }
}


