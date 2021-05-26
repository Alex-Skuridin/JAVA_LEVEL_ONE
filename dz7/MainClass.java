package dz7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catArr = new Cat[5];
        catArr[0] = new Cat("Кузя", 7);
        catArr[1] = new Cat("Беляшь", 8);
        catArr[2] = new Cat("Мурка", 12);
        catArr[3] = new Cat("Микроб", 15);
        catArr[4] = new Cat("Буся", 14);

        FeedBag feedBag = new FeedBag(1000);

        Plate plate = new Plate(200,200);
        plate.info();
        feedBag.info();

        for (Cat cat1 : catArr) {
            cat1.eat(plate);
        }

        plate.info();


        for (Cat cat1 : catArr) {
            cat1.info();
        }
        plate.fillFood(feedBag);
        plate.info();
        feedBag.info();


    }
}
