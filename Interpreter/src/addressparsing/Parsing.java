package addressparsing;

/**
 *解析类
 */
public class Parsing {
    public static void main(String[] args) {
        Context context=new Context();
        context.parsing("河南省郑州市");
        context.parsing("四川省成都市");
        context.parsing("武汉市长江大桥");
        context.parsing("江苏省南京市");
    }
}
