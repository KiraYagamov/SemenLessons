package Patterns.Strategy.Quack;

public class LowVolumeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
