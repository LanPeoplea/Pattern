package command;

/**
 *一个关闭空调命令类
 */
public class OffAircondition implements Command{
    Aircondition aircondition;
    public OffAircondition(Aircondition aircondition){
        this.aircondition=aircondition;
    }

    @Override
    public void execute() {
        aircondition.off();
    }
}
