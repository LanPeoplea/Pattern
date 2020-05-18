package template;

/**
 *具体访问者A类
 */
public class ConcreteVisitorA implements Visitor{

    @Override
    public void visit(ConcreteElementA element) {
        System.out.print("被A访问-----");
        element.operationA();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.print("被A访问-----");
        element.operationB();
    }
}
