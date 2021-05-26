package dz7;

public class Plate {
    private int food;
    private final int PLATE_SIZE;

    public Plate(int food, int plateSize) {
        this.food = food;
        this.PLATE_SIZE = plateSize;
    }

    public boolean decreaseFood(int n) {
        if (n <=0) {
            System.out.println("Не корректное значение аппетита");
            return false;
        }
        if (n > food) {
            System.out.println("В тарелке не хватает еды");
            return false;
        }
        food -= n;
        return true;
    }

        public void info() {
        System.out.println("Plate: " + food);
    }

    public void fillFood(FeedBag bag){
        if (bag.decreaseFood(food, PLATE_SIZE))
        food = PLATE_SIZE;


    }
}
