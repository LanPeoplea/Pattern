package weather;

/**
 *一个Device类，用户可以在移动设备上来查询天气信息
 */
public class Device extends Observer{

    private String oname;
    private Double stateT;
    private String stateW;
    private Weather weather;
    public Device(Weather weather,String oname){
        this.weather=weather;
        this.oname=oname;
    }
    @Override
    public void update() {
        stateT=weather.getTemperature();
        stateW=weather.getWeather();
        System.out.println("用户"+oname+"查看   温度是"+stateT+"度  天气是"+stateW);
    }
}
