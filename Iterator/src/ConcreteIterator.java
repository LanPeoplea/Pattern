import java.util.List;

/**
 *具体迭代器类
 */
public class ConcreteIterator implements Iterator{

    Object obj=null;

    private List<Object> list = null;
    private int index=0;

    public ConcreteIterator(List<Object> list){
        this.list=list;
    }

    @Override
    public Object next() {
        if(this.hasNext())
        {
            obj=list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index<list.size())
            return true;
        else
            return false;
    }
}
