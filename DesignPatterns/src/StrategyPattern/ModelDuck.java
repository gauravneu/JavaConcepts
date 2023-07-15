package StrategyPattern;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
