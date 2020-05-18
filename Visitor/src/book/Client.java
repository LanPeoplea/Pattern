package book;

public class Client {
    public static void main(String[] args) {
        ObjectStructure obj = new ObjectStructure();
        obj.add(new Designpattern());
        obj.add(new Algorithm());
        Visitor visitors = new Student();
        Visitor visitort = new Teacher();
        obj.accept(visitors);
        obj.accept(visitort);
    }
}
