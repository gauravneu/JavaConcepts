package ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        //We are keeping this weatherData object because it would help in deregister later
        // Otherwise we would have directly used weatherData from Constructor
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + "temperature = " + temperature
                + ", humidity = " + humidity + ", pressure = " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        //Not best place to call display(), but it will be handled in MVC model
        display();
    }
}
