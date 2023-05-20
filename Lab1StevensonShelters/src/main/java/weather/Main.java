package weather;

public class Main {
    public static void main(String[] args) {
        StevensionReading sr = new StevensionReading(1.5, 2, 3, 4);
        StevensionReading sr1 = new StevensionReading(1.5, 2, 3, 4);
        System.out.println(sr.equals(sr1));
        System.out.println(sr);
    }
}
