package scenicevaluation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *景区评价程序（访问者模式）：对象结构类
 */
public class ObjectStructure {
    private List<Secnic> list = new ArrayList<Secnic>();
    public void accept(Visitor visitor){
        Iterator<Secnic> i = list.iterator();
        while (i.hasNext()){
            ((Secnic) i.next()).accept(visitor);
        }
    }
    public void add(Secnic secnic){
        list.add(secnic);
    }
    public void remove(Secnic secnic){
        list.remove(secnic);
    }
}
