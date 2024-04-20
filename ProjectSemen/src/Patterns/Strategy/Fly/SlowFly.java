package Patterns.Strategy.Fly;

public class SlowFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Slow flying");
    }
}
