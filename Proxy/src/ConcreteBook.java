/**
 *一个具体对象
 */
public class ConcreteBook implements Book{

    private double space;

    public ConcreteBook(Double space){
        this.space = space;
        calculate();
    }

    public void calculate() {
        System.out.println("正在计算本书所占用磁盘空间-------");
    }

    @Override
    public void display() {
        System.out.println("本书占用磁盘空间为"+space+"Mb");
    }
}
