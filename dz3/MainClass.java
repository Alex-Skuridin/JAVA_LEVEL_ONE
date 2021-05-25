package dz3;

// Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается
// попытки угадать это число. При каждой попытке компьютер должен сообщить больше
// указанное пользователем число, чем загаданное, или меньше. После победы или проигрыш
// выводится запрос «Повторить игру еще раз? 1–да 0– нет»(1повторить,0 нет).

import java.util.Random;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
        Random randNumber = new Random();
        Scanner scanNumber = new Scanner(System.in);
        int restart;
        boolean userGame = false;
        do {
            int pcNumber;
            int userNumber;
            pcNumber = randNumber.nextInt(10);
            System.out.println("Компьютер загадал число от 0 до 9. Попробуйте его угадать. У вас есть 3 попытки");
            for (int i = 1; i < 4; i++) {
                System.out.println("Попытка: " + i + " из 3-х");
                do {
                    System.out.println("Введите число от 0 до 9");
                    userNumber = scanNumber.nextInt();

                } while (userNumber < 0 || userNumber > 9);
                System.out.println("Вы ввели: " + userNumber);

                if (userNumber == pcNumber) {
                    System.out.println("Поздравляем вы угадали");
                    userGame = true;
                    break;
                } else if (userNumber < pcNumber) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }

            }

            if (userGame) {
                do {
                    System.out.println("«Повторить игру еще раз? 1–да 0– нет»?");
                    restart = scanNumber.nextInt();
                } while (restart < 0 || restart > 1);

            } else {
                do {
                    System.out.println("Попытки закончились. Компьютер загадал " + pcNumber + ". «Повторить игру еще раз? 1–да 0– нет»?");
                    restart = scanNumber.nextInt();
                } while (restart < 0 || restart > 1);
            }

        } while (1 == restart);

    }


}
