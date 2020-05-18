/**
 *一个超市类
 */
public class Supermarket {
    public static void main(String[] args) {

        State external = new External();//未进入状态
        State paid = new Paid();//已支付状态
        State unpaid = new UnPaid();//未支付状态

        System.out.println("--------------------------");
        System.out.println("当前状态：正在外部：");
        System.out.print("想要出去：");external.out();
        System.out.print("想要进入:");external.enter();
        System.out.println("--------------------------");
        System.out.println("当前状态：已进入 未支付：");
        System.out.print("想要进入:");unpaid.enter();
        System.out.print("想要出去:");unpaid.out();
        System.out.println("--------------------------");
        System.out.println("当前状态：已进入 已支付：");
        System.out.print("想要进入:");paid.enter();
        System.out.print("想要出去:");paid.out();
    }
}
