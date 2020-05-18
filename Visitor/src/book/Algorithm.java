package book;

/**
 *具体元素类
 */
public class Algorithm implements Book{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void describeAlg() {
        System.out.println("欢迎查看算法导论，本书将会详细地介绍各种算法，带你领略到算法的魅力！");
    }
}
