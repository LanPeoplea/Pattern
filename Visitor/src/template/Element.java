package template;

/**
 *抽象元素类
 */
public interface Element {
    public void accept(Visitor visitor);
}
