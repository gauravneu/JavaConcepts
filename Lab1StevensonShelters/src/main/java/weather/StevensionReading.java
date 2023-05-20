package weather;

import java.util.Objects;

public final class StevensionReading implements WeatherReading {

    private final double c1 = -8.78469475556;
    private final double c2 = 1.61139411;
    private final double c3 = 2.33854883889;
    private final double c4 = -0.14611605;
    private final double c5 = -0.012308094;
    private final double c6 = -0.0164248277778;
    private final double c7 = 0.002211732;
    private final double c8 = 0.00072546;
    private final double c9 = -0.000003582;
    private final double a1 = 100.0;
    private final double a2 = 5.0;
    private final double a3 = 35.74;
    private final double a4 = 0.6215;
    private final double a5 = 35.75;
    private final double a6 = 0.4275;
    private final double a7 = 0.16;
    private final int pow2 = 2;
    private final double heatIndex;
    private final double relativeHumidity;
    private final double windChill;
    private final double totalRain;
    private final double dewPoint;
    private final double temperature;
    private final double windSpeed;

    public StevensionReading(double totalRain, double dewPoint, double temperature, double windSpeed) throws IllegalArgumentException {
        if (dewPoint > temperature || windSpeed < 0 || totalRain < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        this.totalRain = totalRain;
        this.dewPoint = dewPoint;
        this.temperature = temperature;
        this.windSpeed = windSpeed;

        this. relativeHumidity = calcRelativeHumidity(this.dewPoint, this.temperature);
        this.heatIndex = calcHeatIndex(this.temperature, this.relativeHumidity);
        this.windChill = calcWindChill(this.temperature, this.windSpeed);

    }
    private double calcRelativeHumidity(double dewPoint, double temperature){
        return a1 + a2 * (this.dewPoint - this.temperature);
    }

    private double calcHeatIndex(double temperature, double relativeHumidity){
        return c1 +
                c2 * this.temperature +
                c3 * this.relativeHumidity +
                c4 * this.temperature * this.relativeHumidity +
                c5 * Math.pow(this.temperature, pow2) +
                c6 * Math.pow(this.relativeHumidity, pow2) +
                c7 * Math.pow(this.temperature, pow2) * this.relativeHumidity +
                c8 * this.temperature * Math.pow(this.relativeHumidity, pow2) +
                c9 * Math.pow(this.temperature, pow2) * Math.pow(this.relativeHumidity, pow2);
    }

    private double calcWindChill(double temperature, double windSpeed){
        return a3 + a4 * this.temperature -
                a5 * Math.pow(this.windSpeed, a7) +
                a6 * this.temperature * Math.pow(this.windSpeed, a7);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reading: ");
        sb.append("T = ").append(getTemperature());
        sb.append(" D = ").append(getDewPoint());
        sb.append(" v = ").append(getWindSpeed());
        sb.append(" rain = ").append(getTotalRain());
        return sb.toString();
    }

    @Override
    public int getTemperature() {
        return (int) this.temperature;
    }


    @Override
    public int getDewPoint() {
        return (int) this.dewPoint;
    }

    @Override
    public int getWindSpeed() {
        return (int) this.windSpeed;
    }

    @Override
    public int getTotalRain() {
        return (int) this.totalRain;
    }


    @Override
    public int getRelativeHumidity() {
        return (int) this.relativeHumidity;
    }

    @Override
    public int getHeatIndex() {
        return (int) this.heatIndex;
    }

    @Override
    public int getWindChill() {
        return (int) this.windChill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        StevensionReading that = (StevensionReading) o;
        return Double.compare(that.heatIndex, this.heatIndex) == 0
                && Double.compare(that.relativeHumidity, this.relativeHumidity) == 0
                && Double.compare(that.windChill, this.windChill) == 0
                && Double.compare(that.totalRain, this.totalRain) == 0
                && Double.compare(that.dewPoint, this.dewPoint) == 0
                && Double.compare(that.temperature, this.temperature) == 0
                && Double.compare(that.windSpeed, this.windSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.heatIndex,
                this.relativeHumidity,
                this.windChill,
                this.totalRain,
                this.dewPoint,
                this.temperature,
                this.windSpeed);
    }
}
