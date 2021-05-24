package dz4;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static char[][] map = new char[3][3];
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '*';
            }
        }
    }

    public static void printMap() {
        System.out.println("  1 2 3");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) return false;
        if (map[x][y] == '*') return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '*') return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {

        /*
         if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
         if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
         if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
         if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
         if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
         if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
         if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
         if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) return true;
         return false;
         */
        int checkCell;
        for (int i = 0; i < map.length; i++) {      // Цикл проверяет строки на наличие победы
            checkCell = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == symb) checkCell++;
            }
            if (checkCell == map.length) return true;
        }

        for (int i = 0; i < map.length; i++) {      // Цикл проверяет столбцы на наличие победы
            checkCell = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[j][i] == symb) checkCell++;
            }
            if (checkCell == map.length) return true;
        }

        checkCell = 0;                               // Цикл проверяет диагональ сверху вниз на наличие победы
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if ((i == j) && (map[i][j] == symb)) checkCell++;
            }
            if (checkCell == map.length) return true;
        }

        checkCell = 0;                                // Цикл проверяет диагональ снизу вверх на наличие победы
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if ((i + j == map.length - 1) && (map[i][j] == symb)) checkCell++;
            }
            if (checkCell == map.length) return true;
        }
        return false;
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки X и Y");
            System.out.print("X = ");
            x = scan.nextInt() - 1;
            System.out.print("Y = ");
            y = scan.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = 'X';
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        System.out.println("Компьютер сделал ход в ячейку " + (x + 1) + " " + (y + 1));
        map[x][y] = 'O';
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin('X')) {
                System.out.println("Победил игрок");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin('O')) {
                System.out.println("Победил компьютер");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра окончена");


    }


}
