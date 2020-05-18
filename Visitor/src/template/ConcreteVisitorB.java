package template;

/**
 *具体访问者B类
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementA element) {
        System.out.print("被B访问-----");
        element.operationA();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.print("被B访问-----");
        element.operationB();
    }
}
