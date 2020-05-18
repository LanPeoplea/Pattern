/**
 *虚拟代理
 */
public class BookProxy implements Book{

    private ConcreteBook concreteBook;
    private double space;

    public BookProxy(double space){
        this.space=space;
    }
    @Override
    public void display() {
        if (concreteBook==null)
            concreteBook = new ConcreteBook(space);
        concreteBook.display();
    }
}
