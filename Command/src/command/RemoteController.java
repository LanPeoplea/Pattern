package command;

/**
 *一个遥控器类
 */
public class RemoteController {

    Command[] oncommands;
    Command[] offcommands;

    public RemoteController(int commandsize){
        this.oncommands = new Command[commandsize];
        this.offcommands = new Command[commandsize];
    }
    public void setCommand(int i,Command oncommand,Command offcommand){
        oncommands[i] = oncommand;
        offcommands[i] = offcommand;
    }
    public void turnon(int i){
        oncommands[i].execute();
    }
    public  void turnoff(int i){
        offcommands[i].execute();
    }
}
