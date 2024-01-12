package Lesson4;

import java.util.Scanner;

public class GameController {
    int[] field;
    boolean gameEnded;
    int counter;

    public void createField(int length, int shipLength){
        field = new int[length];

        int pos = (int) (Math.random() * (field.length - shipLength-1));

        for (int i = 0; i < field.length; i++) {
            if(i == pos || i == pos+1 || i == pos+2) field[i] = 1;
            else field[i] = 0;
        }
    }

    public void startGame(int length, int shipLength){
        createField(length, shipLength);
        gameEnded = false;
        counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (!gameEnded){
            if (counter >= shipLength) {
                gameEnded = true;
                System.out.println("Победил!");
                break;
            }
            System.out.println("Введите значение от 1 до " + field.length + ": ");
            try {
                int pos = Integer.parseInt(scanner.nextLine());

                if(pos > field.length){
                    throw new Exception();
                }
                shoot(pos);
            }
            catch (Exception ex){
                System.out.println("Введите число от 1 до " + field.length + "!");
            }
        }
    }
    public boolean shoot(int index){
        index -= 1;
        if(field[index] == 1){
            System.out.println("Попал!");
            counter += 1;
            return true;
        }
        System.out.println("Не попал!");
        return false;
    }
}
