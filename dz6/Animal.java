package dz6;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(double distanceValue);

    public abstract void jump(double obstacleValue);

    public abstract void sweem(double distanceValue);

}
