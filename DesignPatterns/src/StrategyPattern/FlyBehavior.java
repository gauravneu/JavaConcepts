package StrategyPattern;


//This is required because not all instances of Ducks can fly.
//Every duck has its own behavior and this behavior can be repeating for many ducks
public interface FlyBehavior {
    void fly();
}
