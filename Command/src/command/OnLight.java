package command;

/**
 *一个开灯命令类
 */
public class OnLight implements Command{
    Light light;
    public OnLight(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
