package sample.model;

import java.time.LocalDateTime;

/**
 * Created by Lenovo on 2016-11-17.
 */
public class Weather {

    private double temperatureInCelsius;
    private LocalDateTime lastUpdated;
    private double feelslikeTemperatureInCelsius;
    private String iconUrl;
    private boolean isDay;
    private double pressureMb;
    private String location;
    private WeatherCondition weatherCondition;

    public Weather(double temperatureInCelsius, LocalDateTime lastUpdated, double feelslikeTemperatureInCelsius, String iconUrl, boolean isDay, double pressureMb, String location, WeatherCondition weatherCondition) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.lastUpdated = lastUpdated;
        this.feelslikeTemperatureInCelsius = feelslikeTemperatureInCelsius;
        this.iconUrl = iconUrl;
        this.isDay = isDay;
        this.pressureMb = pressureMb;
        this.location = location;
        this.weatherCondition = weatherCondition;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getFeelslikeTemperatureInCelsius() {
        return feelslikeTemperatureInCelsius;
    }

    public void setFeelslikeTemperatureInCelsius(double feelslikeTemperatureInCelsius) {
        this.feelslikeTemperatureInCelsius = feelslikeTemperatureInCelsius;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
}
