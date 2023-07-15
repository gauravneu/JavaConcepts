package StrategyPattern;

public class ModelDuckSimulator {
    public static void main(String[] args) {
        ModelDuck md = new ModelDuck();
        md.performFly();
        md.setFlyBehavior(new FlyRocketPowered());
        md.performFly();
    }
}
