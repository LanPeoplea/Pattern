package book;

/**
 *具体元素类
 */
public class Designpattern implements Book{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void describeDsp() {
        System.out.println("欢迎查看设计模式书籍，本书将会为你打开设计模式之门！");
    }
}
