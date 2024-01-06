package Game;

public class GameController {
    boolean gameEnded;
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int currentNum = (int) (Math.random() * 100);

    public void start(){
        gameEnded = false;
        while(!gameEnded){
            iteration();
        }
    }

    private void iteration(){
        p1.rollNum();
        p2.rollNum();
        p3.rollNum();
        if(p1.number == currentNum || p2.number == currentNum || p3.number == currentNum){
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println();
            System.out.println("Заганное число: " + currentNum);
            gameEnded = true;
        }
        System.out.println("Игрок 1 ответил: " + p1.number);
        System.out.println("Игрок 2 ответил: " + p2.number);
        System.out.println("Игрок 3 ответил: " + p3.number);
        System.out.println();
    }
}