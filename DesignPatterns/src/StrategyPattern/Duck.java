package StrategyPattern;

public abstract class Duck {

    //“Program to an interface” really means “Program to a supertype.”

    //We are using Interface because these behaviors
    // can vary duck to duck and can also be same for many


    //In other words, if you’ve got some aspect of your code
    // that is changing, say with every new requirement,
    // then you know you’ve got a behavior that needs to
    // be pulled out and separated from all the stuff that doesn’t change.

    //In other words,

    //take the parts that vary and encapsulate them,
    // so that later you can alter or extend
    // the parts that vary without affecting those that don’t.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}



    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, Even Decoys!");
    }


    //Below code is to set behavior dynamically

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}
