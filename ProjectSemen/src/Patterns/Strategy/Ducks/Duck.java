package Patterns.Strategy.Ducks;

import Patterns.Strategy.Fly.FlyBehavior;
import Patterns.Strategy.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public void quack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("Swimming");
    }
    public void display(){
        System.out.println("This is a " + this.getClass().getSimpleName());
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void setFly(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuack(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
