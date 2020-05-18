package command;

/**
 *一个关闭电视机命令类
 */
public class OffTV implements Command{
    TV tv;
    public OffTV(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
