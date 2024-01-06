package Game;

public class Player {
    int number;
    public void rollNum(){
        number = (int) (Math.random() * 100);
    }
}