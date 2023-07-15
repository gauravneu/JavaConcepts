package StrategyPattern;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with Rocket Speed");
    }
}
