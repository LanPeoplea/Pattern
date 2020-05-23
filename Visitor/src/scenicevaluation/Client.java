package scenicevaluation;

/**
 *景区评价程序（访问者模式）：Client类
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure obj = new ObjectStructure();
        obj.add(new SecnicA());
        obj.add(new SecnicB());
        Visitor visitorA = new VisitorA();
        Visitor visitorB = new VisitorB();
        obj.accept(visitorA);
        obj.accept(visitorB);
    }
}
