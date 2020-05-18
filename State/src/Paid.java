/**
 *未支付状态，此时还不能够出去，不需要进入
 */
public class Paid implements State{
    @Override
    public void enter() {
        System.out.println("您现在正在超市中，不需要再次进入！");
    }

    @Override
    public void out() {
        System.out.println("欢迎下次再来");
    }
}
