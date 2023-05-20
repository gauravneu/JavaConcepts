package transmission;

public class AutomaticTransmission implements Transmission {

    private int speed;
    private int gear;
    private int cutOff1;
    private int cutOff2;
    private int cutOff3;
    private int cutOff4;
    private int cutOff5;

    public AutomaticTransmission(int cutOff1,
                                 int cutOff2,
                                 int cutOff3,
                                 int cutOff4,
                                 int cutOff5) throws IllegalArgumentException {
        //This condition is to ensure cutoff is not negative and in increasing order

        if (cutOff5 > cutOff4 && cutOff4 > cutOff3 && cutOff3 > cutOff2 && cutOff2 > cutOff1 && cutOff1 > 0) {
            this.speed = 0;
            this.gear = 0;
            this.cutOff1 = cutOff1;
            this.cutOff2 = cutOff2;
            this.cutOff3 = cutOff3;
            this.cutOff4 = cutOff4;
            this.cutOff5 = cutOff5;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void increaseSpeed() {
        this.speed++;
        setGear();
    }

    @Override
    public void decreaseSpeed() throws IllegalStateException {
        if(this.speed ==0) {
            throw new IllegalStateException();
        }
        else{
            this.speed--;
            setGear();

        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getGear() {
        return this.gear;
    }
// Function sets gear everytime speed is changed
    private void setGear(){
        if(this.speed == 0){
            this.gear = 0;
        }
        else if(this.speed <= cutOff1 && this.speed > 0){
            this.gear = 1;
        }
        else if(this.speed <= cutOff2 && this.speed > this.cutOff1){
            this.gear = 2;
        }
        else if(this.speed <= cutOff3 && this.speed > this.cutOff2){
            this.gear = 3;
        }
        else if(this.speed <= cutOff4 && this.speed > this.cutOff3){
            this.gear = 4;
        }
        else if(this.speed <= cutOff5 && this.speed > this.cutOff4){
            this.gear = 5;
        }
        else{
            this.gear = 6;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transmission (");
        sb.append("speed = ").append(this.speed);
        sb.append(", gear = ").append(this.gear);
        sb.append(")");
        return sb.toString();
    }
}
