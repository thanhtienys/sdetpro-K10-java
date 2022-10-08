package src.lesson_10;

public class AnimalPattern {
    private String name;
    private int maxSpeed;
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

    private AnimalPattern (RegisterRacing registerRacing) {
        this.name = registerRacing.name;
        this.maxSpeed = registerRacing.maxSpeed;
        this.fly = registerRacing.fly;
    }

    public static class RegisterRacing {
        private String name;
        private int maxSpeed;
        private boolean fly;

        public RegisterRacing() {
        }

        public RegisterRacing setName(String name) {
            this.name = name;
            return this;
        }

        public RegisterRacing setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public RegisterRacing setFly(boolean fly) {
            this.fly = fly;
            return this;
        }

        public AnimalPattern build() {
            return new AnimalPattern(this);
        }
    }

}


