package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *对象结构类
 */
public class ObjectStructure {
    private List<Book> list = new ArrayList<Book>();
    public void accept(Visitor visitor){
        Iterator<Book> i = list.iterator();
        while (i.hasNext()){
            ((Book) i.next()).accept(visitor);
        }
    }
    public void add(Book book){
        list.add(book);
    }
    public void remove(Book book){
        list.remove(book);
    }
}
