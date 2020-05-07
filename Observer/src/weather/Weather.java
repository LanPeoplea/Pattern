package weather;

/**
 *天气类
 */
public class Weather extends Subject{

    private String weather;//天气
    private Double temperature;//温度

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
