package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.model.Weather;
import sample.service.WeatherServiceJsonOrg;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label dataLabel;

    @FXML
    private Label textConditionLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private ImageView iconImageView;

    @FXML
    private Label cityLabel;

    private Weather currentWeather;

    public void initialize(URL location, ResourceBundle resources) {
        setValuesComponentsFromServer();
    }

    private void setValuesComponentsFromServer(){
        WeatherServiceJsonOrg weatherServiceJsonOrg = new WeatherServiceJsonOrg("94883fef4b9f4b2b9f7150333161711");
        currentWeather = weatherServiceJsonOrg.getWeatherFromUrl("http://api.apixu.com/v1/current.json", "Warsaw");
        dataLabel.setText(currentWeather.getLastUpdated());
        cityLabel.setText(currentWeather.getLocation());
        temperatureLabel.setText(String.valueOf(currentWeather.getTemperatureInCelsius()));
        textConditionLabel.setText(currentWeather.getWeatherCondition().getText());
    }
}



























