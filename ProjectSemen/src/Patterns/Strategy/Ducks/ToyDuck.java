package Patterns.Strategy.Ducks;

import Patterns.Strategy.Fly.CantFly;
import Patterns.Strategy.Quack.ToyQuack;

public class ToyDuck extends Duck {
    public ToyDuck(){
        super(new CantFly(), new ToyQuack());
    }
}
