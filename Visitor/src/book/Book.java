package book;

/**
 *抽象元素类
 */
public interface Book {
    public void accept(Visitor visitor);
}
