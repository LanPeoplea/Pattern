package book;

//抽象访问者
public interface Visitor {
    void visit(Designpattern dsp);
    void visit(Algorithm algorithm);
}
