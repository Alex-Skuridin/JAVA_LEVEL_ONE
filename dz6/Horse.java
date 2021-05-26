package dz6;



public class Horse extends Animal {

    private double maxRunDistance;
    private double maxJumpDistance;
    private double maxSweemDistance;

    double runMin = 1000;
    double runMax = 2000;
    double jumpMin = 2.1;
    double jumpMax = 2.9;
    double sweemMin = 20;
    double sweemMax = 100;


    public Horse(String name) {
        super(name);

        this.maxRunDistance = Randomizer.randomValue(runMin, runMax);
        this.maxJumpDistance = Randomizer.randomValue(jumpMin, jumpMax);
        this.maxSweemDistance = Randomizer.randomValue(sweemMin, sweemMax);

    }


    public void printInfo() {
        System.out.println("Лошадь " + super.name + "\n" +
                "Может пробежать: " + maxRunDistance + "м \n"
                + "Может перепрыгнуть: " + maxJumpDistance + "м \n"
                + "Может проплыть: " + maxSweemDistance + "м \n \n");
    }


    @Override
    public void run(double distanceValue) {
        if (distanceValue <= 0) {
            System.out.println("Неверное значение дистанции бега. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = distanceValue <= maxRunDistance ? ("Лошадь " + super.name + " пробежал " + distanceValue + "м") : "Такую большую дистанцию лошадь не пробежит";
        System.out.println(runAnswer);

    }

    @Override
    public void jump(double obstacleValue) {
        if (obstacleValue <= 0) {
            System.out.println("Неверное значение дистанции бега. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = obstacleValue <= maxJumpDistance ? ("Лошадь " + super.name + " перепрыгнул " + obstacleValue + "м") : "Такое большое препятствие лошадь не перепрыгнет";
        System.out.println(runAnswer);

    }

    @Override
    public void sweem(double distanceValue) {
        if (distanceValue <= 0) {
            System.out.println("Неверное значение дистанции бега. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = distanceValue <= maxSweemDistance ? ("Лошадь " + super.name + " проплыл " + distanceValue + "м") : "Такую большую дистанцию лошадь не проплывет";
        System.out.println(runAnswer);

    }
}
