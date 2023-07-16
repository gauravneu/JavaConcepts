package ObserverPattern;

public class ThirdPartyDisplay implements Observer, DisplayElement{

    private float temperature;
    private float pressure;
    private final WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData){

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions: "+ "temperature = "+ temperature
                +", pressure = " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;

        this.pressure = pressure;
        //Not best place to call display(), but it will be handled in MVC model
        display();
    }
}
