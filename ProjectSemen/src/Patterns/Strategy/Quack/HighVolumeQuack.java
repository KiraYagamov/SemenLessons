package Patterns.Strategy.Quack;

public class HighVolumeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUAAAACK");
    }
}
