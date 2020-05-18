package command;

/**
 *一个关灯命令类
 */
public class OffLight implements Command {
    Light light;
    public OffLight(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
