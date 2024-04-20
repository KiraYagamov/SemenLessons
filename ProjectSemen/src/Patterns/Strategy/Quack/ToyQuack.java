package Patterns.Strategy.Quack;

public class ToyQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack (like a toy)");
    }
}
