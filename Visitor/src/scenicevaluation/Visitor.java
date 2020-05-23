package scenicevaluation;

/**
 *景区评价程序（访问者模式）：接口
 */
public interface Visitor {
    void visit(SecnicA secnic);
    void visit(SecnicB secnic);
    void comment(SecnicA secnic);
    void comment(SecnicB secnic);
}
