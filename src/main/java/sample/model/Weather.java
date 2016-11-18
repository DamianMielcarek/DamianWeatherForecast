package sample.model;

//import java.time.String;

/**
 * Created by Lenovo on 2016-11-17.
 */
public class Weather {

    private double temperatureInCelsius;
    private String lastUpdated;
    private double feelsLikeTemperatureInCelsius;
    private boolean isDay;
    private double pressureMb;
    private String location;
    private WeatherCondition weatherCondition;

    public Weather(double temperatureInCelsius, String lastUpdated, double feelsLikeTemperatureInCelsius, boolean isDay, double pressureMb, String location, WeatherCondition weatherCondition) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.lastUpdated = lastUpdated;
        this.feelsLikeTemperatureInCelsius = feelsLikeTemperatureInCelsius;
        this.isDay = isDay;
        this.pressureMb = pressureMb;
        this.location = location;
        this.weatherCondition = weatherCondition;
    }

    public Weather(){};

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getFeelsLikeTemperatureInCelsius() {
        return feelsLikeTemperatureInCelsius;
    }

    public void setFeelsLikeTemperatureInCelsius(double feelsLikeTemperatureInCelsius) {
        this.feelsLikeTemperatureInCelsius = feelsLikeTemperatureInCelsius;
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

    @Override
    public String toString() {
        return "Weather{" +
                "temperatureInCelsius=" + temperatureInCelsius +
                ", lastUpdated=" + lastUpdated +
                ", feelsLikeTemperatureInCelsius=" + feelsLikeTemperatureInCelsius +
                ", isDay=" + isDay +
                ", pressureMb=" + pressureMb +
                ", location='" + location + '\'' +
                ", weatherCondition=" + weatherCondition +
                '}';
    }
}
