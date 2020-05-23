package scenicevaluation;

import java.util.List;

/**
 *景区评价程序（访问者模式）：景点A
 */
public class SecnicA implements Secnic{

    private String comments="这里是景点A,喜欢的话请在评论处评论哦！";//游客评价

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
