package ObserverPattern;

public interface Observer {
    //we have this function which subject will use to update the observers
    void update(float temp, float humidity, float pressure);
}
