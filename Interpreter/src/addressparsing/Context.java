package addressparsing;

/**
 *
 */
public class Context {
    private String[] provinces={"河南","河北","安徽","江苏","湖北","四川"};
    private String[] citys={"郑州市","武汉市","南京市","成都市","广州市"};
    private Expression provincesCity;
    public Context(){
        Expression province=new TerminalExpression(provinces);
        Expression city=new TerminalExpression(citys);
        provincesCity=new NonterminalExpression(province,city);
    }
    public void parsing(String address) {
        boolean ok=provincesCity.interpret(address);
        if(ok) System.out.println("地址正确，为："+address);
        else System.out.println(address+"，地址错误，请检查您的地址格式！");
    }
}
