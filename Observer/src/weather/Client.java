package weather;

public class Client {
    public static void main(String[] args) {
        Weather w=new Weather();

        Observer a=new Device( w,"A");
        Observer b=new Device( w,"B");
        w.attach(a);
        w.attach(b);
        w.setWeather("晴天");
        w.setTemperature(25.5);
        w.Notify();
        w.setWeather("多云");
        w.setTemperature(16.8);
        w.Notify();
    }
}
