package observer.pattern.weather.station.example1;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
