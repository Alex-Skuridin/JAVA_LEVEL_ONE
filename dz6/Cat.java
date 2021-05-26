package dz6;

public class Cat extends Animal {

    private final double MAX_RUN_DISTANCE = 200;
    private final double MAX_JUMP_DISTANCE = 2;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(double distanceValue) {          //Кот может пробежать только 200м
        if (distanceValue <= 0) {
            System.out.println("Неверное значение дистанции бега. Значение должно быть больше ноля");
            return;
        }
        String runAnswer = distanceValue <= MAX_RUN_DISTANCE ? ("Котик " + super.name + " пробежал " + distanceValue + "м") : "Такую большую дистанцию котик не пробежит";
        System.out.println(runAnswer);
    }

    @Override
    public void jump(double obstacleValue) {          //Кот может прыгнуть только на 2м
        if (obstacleValue <= 0) {
            System.out.println("Неверное значение размера препятствия. Значение должно быть больше ноля");
            return;
        }
        String jumpAnswer = obstacleValue <= MAX_JUMP_DISTANCE ? ("Котик " +super.name +" перепрыгнул " + obstacleValue + "м") : "Такую большую высоту котик не перепрыгнет";
        System.out.println(jumpAnswer);
    }
    @Override
    public void sweem(double distanceValue) {          //Кот плавать не умеет
        if (distanceValue <= 0) {
            System.out.println("Неверное значение размера препятствия. Значение должно быть больше ноля");
            return;
        }
        System.out.println("Котик " +super.name +" плавать не умеет");
    }






}
