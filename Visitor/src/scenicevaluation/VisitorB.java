package scenicevaluation;

import java.util.Scanner;

/**
 *景区评价程序（访问者模式）：具体游客B
 */
public class VisitorB implements Visitor{

    @Override
    public void visit(SecnicA secnic) {
        System.out.println("游客B来到了景点A--------------------");
        secnic.displaycomment();
    }

    @Override
    public void visit(SecnicB secnic) {
        System.out.println("游客B来到了景点B--------------------");
        secnic.displaycomment();
    }

    @Override
    public void comment(SecnicA secnic) {
        System.out.print("请写出您的评论:");
        Scanner in =new Scanner(System.in);
        String comment=in.nextLine();
        secnic.setComments(comment);
    }

    @Override
    public void comment(SecnicB secnic) {
        System.out.print("请写出您的评论:");
        Scanner in =new Scanner(System.in);
        String comment=in.nextLine();
        secnic.setComments(comment);
    }
}
