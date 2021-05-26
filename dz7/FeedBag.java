package dz7;

public class FeedBag {
    private int size;

    public FeedBag(int size) {
        this.size = size;
    }

    public boolean decreaseFood(int food, int plateSize) {
        if (food < 0 || plateSize < 0) {
            System.out.println("Не корректное значение тарелки");
            return false;
        }
        if (size < (plateSize - food) ) {
            System.out.println("Не хватает еды");
            return false;
        }
        size -= (plateSize - food);
        return true;
    }

    public void info(){
        System.out.println("FeedBag: " +size);
    }
}
