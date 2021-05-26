package dz6;

public class Dog extends Animal {
    private final double MAX_RUN_DISTANCE = 500;
    private final double MAX_JUMP_DISTANCE = 0.5;
    private final double MAX_SWEEM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }

    public void run(double distanceValue) {          //Собака пробежит 500м
        if (distanceValue <= 0) {
            System.out.println("Неверное значение дистанции бега. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = distanceValue <= MAX_RUN_DISTANCE ? ("Собака " +super.name +" пробежала " + distanceValue + "м") : "Такую большую дистанцию собака не пробежит";
        System.out.println(runAnswer);
    }

    public void jump(double obstacleValue) {          //Собака прыгнет на 0.5м
        if (obstacleValue <= 0) {
            System.out.println("Неверное значение размера препятствия. Значение должно быть больше ноля");
            return;
        }
        String jumpAnswer = obstacleValue <= MAX_JUMP_DISTANCE ? ("Собака " +super.name +" перепрыгнула " + obstacleValue + "м") : "Такую большую высоту собака не перепрыгнет";
        System.out.println(jumpAnswer);
    }

    public void sweem(double distanceValue) {          //Собака проплывет 10м
        if (distanceValue <= 0) {
            System.out.println("Неверное значение дистанции плавания. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = distanceValue <= MAX_SWEEM_DISTANCE ? ("Собака " +super.name +" проплыла " + distanceValue + "м") : "Такую большую дистанцию собака не проплывет";
        System.out.println(runAnswer);
    }
}
