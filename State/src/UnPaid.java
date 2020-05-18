/**
 *已支付状态，此时可以出去，不需要进入
 */
public class UnPaid implements State{
    @Override
    public void enter() {
        System.out.println("您现在正在超市中，不需要再次进入！");
    }

    @Override
    public void out() {
        System.out.println("您现在还未结账，请先结账再走出超市！");
    }
}
