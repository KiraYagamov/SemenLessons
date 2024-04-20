package Patterns.Strategy.Fly;

public class FastFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fast flying");
    }
}
