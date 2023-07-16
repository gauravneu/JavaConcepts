package ObserverPattern;

public class WeatherStationTestHarness {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(23, 4532, 33);
        weatherData.setMeasurements(54, 64, 64);
    }

}
