package scenicevaluation;

import java.util.List;

/**
 *景区评价程序（访问者模式）：景点B
 */
public class SecnicB implements Secnic{

    private String comments="这里是景点B，欢迎评论";//游客评价

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        visitor.comment(this);
    }
    public void displaycomment(){
        System.out.println("本景点的评论如下"+comments);
    }
}
