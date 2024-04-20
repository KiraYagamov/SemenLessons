package Patterns.Strategy.Ducks;

import Patterns.Strategy.Fly.SlowFly;
import Patterns.Strategy.Quack.HighVolumeQuack;

public class BigDuck extends Duck {
    public BigDuck(){
        super(new SlowFly(), new HighVolumeQuack());
    }
}
