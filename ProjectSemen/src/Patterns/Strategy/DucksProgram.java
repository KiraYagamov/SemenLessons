package Patterns.Strategy;

import Patterns.Strategy.Ducks.BigDuck;
import Patterns.Strategy.Ducks.Duck;
import Patterns.Strategy.Quack.ToyQuack;

public class DucksProgram {
    public static void main(String[] args) {
        Duck duck = new BigDuck();
        duck.fly();
        duck.quack();
        duck.setQuack(new ToyQuack());
        duck.quack();
        duck.display();
    }
}
