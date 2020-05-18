/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("客户1");
        aggregate.add("客户2");
        aggregate.add("客户3");
        aggregate.add("客户4");

        Iterator iterator = aggregate.iterator();
        System.out.println("客户姓名如下:");
        while (iterator.hasNext())
        {
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
