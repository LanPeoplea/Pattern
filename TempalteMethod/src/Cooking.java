/**
 *这是一个炒菜小程序
 * 使用了模板方法模式完成
 */
public class Cooking {
    public static void main(String[] args) {
        Cook potato = new Potato();
        potato.cookprocess();
        Cook egg = new Egg();
        egg.cookprocess();
    }
}

//一个抽象模板类
abstract class Cook{
    //炒菜过程
    final void cookprocess(){
        this.pouroil();//倒油
        this.heatoil();//热油
        this.pourvegetable();//导入蔬菜
        this.poursauce();//添加调料
        this.fry();//翻炒
        this.finish();//炒菜结束
    }

    void pouroil(){
        System.out.println("正在向锅里倒油。。。。。。");
    }
    void heatoil(){
        System.out.println("正在加热锅里的油。。。。。。");
    }
    abstract void pourvegetable();
    abstract void poursauce();
    void fry(){
        System.out.println("开始翻炒蔬菜，马上就可以出锅了。。。。。。");
    }
    void finish(){
        System.out.println("已经炒好菜啦，出锅！--------------------------");
    }
}

//一个具体类：炒土豆
class Potato extends Cook{

    @Override
    void pourvegetable() {
        System.out.println("正在向锅里倒入土豆，请稍等");
    }

    @Override
    void poursauce() {
        System.out.println("加入一点辣椒、食盐、酱油--------");
    }
}

//一个具体类：抄鸡蛋
class Egg extends Cook{

    @Override
    void pourvegetable() {
        System.out.println("正在往锅里倒入鸡蛋，请稍等");
    }

    @Override
    void poursauce() {
        System.out.println("加入一点食盐");
    }
}