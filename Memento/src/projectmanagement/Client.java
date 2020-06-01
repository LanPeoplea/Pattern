package projectmanagement;

/**
 *操作界面
 */
public class Client {
    public static void main(String[] args) {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setVersion("version 1.1.0");
        System.out.println("初始提交版本:"+or.getVersion());
        cr.setMemento(or.createMemento()); //保存状态
        or.setVersion("version 1.2.0");
        System.out.println("最新提交版本:"+or.getVersion());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复历史版本:"+or.getVersion());
    }
}
