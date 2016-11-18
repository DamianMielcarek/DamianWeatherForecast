package sample.service;

import sample.model.Weather;

/**
 * Created by Lenovo on 2016-11-17.
 */
public interface WeatherService {
    Weather getWeatherFromUrl(String url, String city);
}
