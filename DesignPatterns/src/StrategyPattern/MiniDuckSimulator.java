package StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
    }
}
