package DecoratorPattern;

public abstract class Beverage {
    public enum Size{TALL, GRAND, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Package";

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
