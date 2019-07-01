package observer;

import java.util.ArrayList;

public class MeteorologicalStation implements Subject {
    private float pressure;
    private float temperature;
    private float humidity;
    private ArrayList<Observer> observers;

    public MeteorologicalStation() {
    }

    public MeteorologicalStation(ACompany company) {
        observers = new ArrayList<Observer>();
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void uploadData(float pressure, float temperature, float humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        notifObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }



    @Override
    public void notifObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.getMeteorologicalStationData(getPressure(), getTemperature(), getHumidity());
        }
    }

}