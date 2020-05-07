package chat;

public class UserB extends User {
    private static final long serialVersionUID = -474879276076308825L;
    public UserB(String name)
    {
        super(name);
        ClientWindow(350,100);
    }
    public void send(String ad)
    {
        ReceiveArea.append("我: "+ad+"\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        medium.relay(name,ad);
    }
    public void receive(String from,String ad)
    {
        ReceiveArea.append(from +": "+ad+"\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }
}
