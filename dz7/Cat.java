package dz7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite <= 0) {
            System.out.println("Не корректное значение аппетита. Значение должно быть больше нуля.");
            return;
        }
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public void info(){
        System.out.println("Name: " +name +"\n" +
                "Appetite: " +appetite +"\n" +
                "Satiety: " +satiety);
    }
}
