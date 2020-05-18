package template;

public class Client {
    public static void main(String[] args) {
        ObjectStructure obj = new ObjectStructure();
        obj.add(new ConcreteElementA());
        obj.add(new ConcreteElementB());
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();
        obj.accept(visitorA);
        obj.accept(visitorB);
    }
}
