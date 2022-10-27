package src.lab_10_edit;

public class Animal {

    private String name;
    private int speed;

    private boolean isFly;

    //READ-ONLY

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFly() {
        return isFly;
    }

    protected Animal(Register register){
        this.name = register.name;
        this.speed = register.speed;
        this.isFly = register.isFly;
    }

    //WRITE-ONLY

    public static class Register{
        private String name;
        private int speed;
        private boolean isFly;

        protected Register(){};

        public Register setName(String name) {
            this.name = name;
            return this;
        }

        public Register setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Register setFly(boolean fly) {
            isFly = fly;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isFly=" + isFly +
                '}';
    }
}
