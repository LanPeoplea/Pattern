package command;

/**
 *一个打开电视机命令类
 */
public class OnTV implements Command{
    TV tv;
    public OnTV(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
