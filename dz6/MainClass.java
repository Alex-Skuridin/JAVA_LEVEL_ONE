package dz6;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Dog[] dogs = new Dog[2];
        Horse[] horses = new Horse[5];

        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Тишка");
        dogs[0] = new Dog("Мухтар");
        dogs[1] = new Dog("Чарлик");

        cats[0].jump(1.56);
        cats[0].run(148);
        cats[0].sweem(14);
        cats[1].jump(2.56);
        cats[1].run(210);
        cats[1].sweem(5);

        dogs[0].jump(0.47);
        dogs[0].run(412);
        dogs[0].sweem(8.35);
        dogs[0].jump(2.47);
        dogs[0].run(560);
        dogs[0].sweem(115);

        horses[0] = new Horse("Уголек");
        horses[1] = new Horse("Сахарок");
        horses[2] = new Horse("Резвый");
        horses[3] = new Horse("Звезда");
        horses[4] = new Horse("Сивка");

        for (Horse horse : horses) {
            horse.printInfo();
        }



        for (Horse horse : horses) {
            horse.run(Randomizer.randomValue(1000,2000));
            horse.jump(Randomizer.randomValue(2.1,2.9));
            horse.sweem(Randomizer.randomValue(200,100));
        }

    }

}
