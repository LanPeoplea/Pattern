package addressparsing;

/**
 *终结符类
 */
public class NonterminalExpression implements Expression{
    private Expression province = null;
    private Expression city = null;
    public NonterminalExpression(Expression province, Expression city) {
        this.province = province;
        this.city = city;
    }
    public boolean interpret(String address) {
        String s[]=address.split("省");
        return province.interpret(s[0])&&city.interpret(s[1]);
    }
}
