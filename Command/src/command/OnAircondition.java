package command;

/**
 *一个打开空调命令类
 */
public class OnAircondition implements Command{
    Aircondition aircondition;
    public OnAircondition(Aircondition aircondition){
        this.aircondition=aircondition;
    }

    @Override
    public void execute() {
        aircondition.on();
    }
}
