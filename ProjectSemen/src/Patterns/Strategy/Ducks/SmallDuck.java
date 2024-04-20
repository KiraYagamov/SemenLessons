package Patterns.Strategy.Ducks;

import Patterns.Strategy.Fly.FastFly;
import Patterns.Strategy.Quack.LowVolumeQuack;

public class SmallDuck extends Duck {
    public SmallDuck(){
        super(new FastFly(), new LowVolumeQuack());
    }
}
