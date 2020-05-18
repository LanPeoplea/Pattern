package template;

/**
 *具体元素A类
 */
public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("具体元素A操作");
    }
}
