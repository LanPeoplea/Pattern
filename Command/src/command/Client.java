package command;

/**
 *一个Client交互类
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();
        Aircondition aircondition = new Aircondition();

        Command lighton = new OnLight(light);
        Command lightoff = new OffLight(light);
        Command tvon = new OnTV(tv);
        Command tvoff = new OffTV(tv);
        Command airon = new OnAircondition(aircondition);
        Command airoff = new OffAircondition(aircondition);

        RemoteController remoteController = new RemoteController(3);
        remoteController.setCommand(0,lighton,lightoff);
        remoteController.setCommand(1,tvon,tvoff);
        remoteController.setCommand(2,airon,airoff);

        remoteController.turnon(0);
        remoteController.turnon(1);
        remoteController.turnon(2);
        remoteController.turnoff(0);
        remoteController.turnoff(1);
        remoteController.turnoff(2);
    }
}
