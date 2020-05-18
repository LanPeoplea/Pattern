/**
 *位于超市外部，此时可以进入，不需要出去
 */
public class External implements State{
    @Override
    public void enter() {
        System.out.println("欢迎光临！");
    }

    @Override
    public void out() {
        System.out.println("您还未进入超市，不需要出去");
    }
}
