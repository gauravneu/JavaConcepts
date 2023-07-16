package StrategyPattern;

public class AbsC extends Abs {
    private final boolean isOn;

    {
        isOn = true;

    }
    //
//    public AbsC(boolean isOn) {
//        this.isOn = isOn;
//    }
}

class Demo {
    public static void main(String[] args) {


        AbsC a1 = new AbsC();
        Abs a2 = new Abs() {
            @Override
            public int he() {
                return super.he();
            }
        };
        System.out.println(a2.getClass());
    }
}
