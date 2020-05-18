package book;

/**
 *具体观察者类
 */
public class Teacher implements Visitor{

    @Override
    public void visit(Designpattern dsp) {
        System.out.print("被教师查看------->");
        dsp.describeDsp();
    }

    @Override
    public void visit(Algorithm algorithm) {
        System.out.print("被教师查看------->");
        algorithm.describeAlg();
    }
}
