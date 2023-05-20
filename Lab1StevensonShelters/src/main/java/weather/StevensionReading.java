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
    private final double heatIndex;
    private final double relativeHumidity;
    private final double windChill;
    private final double totalRain;
    private final double dewPoint;
    private final double temperature;
    private final double windSpeed;

    public StevensionReading(double totalRain, double dewPoint, double temperature, double windSpeed) throws IllegalArgumentException {
        if (dewPoint > temperature || windSpeed < 0 || totalRain < 0) {
            throw new IllegalArgumentException("Illegal Input Values");
        }
        this.totalRain = totalRain;
        this.dewPoint = dewPoint;
        this.temperature = temperature;
        this.windSpeed = windSpeed;

        this.relativeHumidity = 100 + 5 * (this.dewPoint - this.temperature);
        this.heatIndex = c1 +
                c2 * this.temperature +
                c3 * this.relativeHumidity +
                c4 * this.temperature * this.relativeHumidity +
                c5 * Math.pow(this.temperature, 2) +
                c6 * Math.pow(this.relativeHumidity, 2) +
                c7 * Math.pow(this.temperature, 2) * this.relativeHumidity +
                c8 * this.temperature * Math.pow(this.relativeHumidity, 2) +
                c9 * Math.pow(this.temperature, 2) * Math.pow(this.relativeHumidity, 2);

        this.windChill = 35.74 + 0.6215 * this.temperature -
                35.75 * Math.pow(this.windSpeed, 0.16) +
                0.4275 * this.temperature * Math.pow(this.windSpeed, 0.16);

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
        return (int) windSpeed;
    }

    @Override
    public int getTotalRain() {
        return (int) totalRain;
    }


    @Override
    public int getRelativeHumidity() {
        return (int) relativeHumidity;
    }

    @Override
    public int getHeatIndex() {
        return (int) heatIndex;
    }

    @Override
    public int getWindChill() {
        return (int) windChill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StevensionReading that = (StevensionReading) o;
        return Double.compare(that.heatIndex, heatIndex) == 0
                && Double.compare(that.relativeHumidity, relativeHumidity) == 0
                && Double.compare(that.windChill, windChill) == 0
                && Double.compare(that.totalRain, totalRain) == 0
                && Double.compare(that.dewPoint, dewPoint) == 0
                && Double.compare(that.temperature, temperature) == 0
                && Double.compare(that.windSpeed, windSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heatIndex,
                relativeHumidity,
                windChill,
                totalRain,
                dewPoint,
                temperature,
                windSpeed);
    }
}
