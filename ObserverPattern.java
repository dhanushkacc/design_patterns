import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

static class WeatherStation {
    private List<WeatherDisplay> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(WeatherDisplay observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDisplay observer) {
        observers.remove(observer);
    }

    // Notify all observers abot the temperature change
    public void notifyObservers() {
        for (WeatherDisplay observer : observers) {
            observer.update(temperature);
        }
    }

    // Show the temperature and notify observers
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("WeatherStation: Temperature updated to " + temperature + "°C");
        notifyObservers();
    }
}

// The Observer- WeatherDisplay
static class WeatherDisplay {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    // Update method acording to temperature change
    public void update(int temperature) {
        System.out.println(name + ": Received temperature update: " + temperature + "°C");
    }
}
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Observers
        WeatherDisplay phoneDisplay = new WeatherDisplay("Phone Display");
        WeatherDisplay tvDisplay = new WeatherDisplay("TV Display");

        // Register observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Update temperature
        weatherStation.setTemperature(25); // Notify observers
        weatherStation.setTemperature(30); // Notify observers again
    }
}


    

