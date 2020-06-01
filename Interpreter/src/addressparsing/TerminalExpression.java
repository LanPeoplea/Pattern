package addressparsing;

import java.util.HashSet;
import java.util.Set;

/**
 *终结符类
 */
public class TerminalExpression implements Expression {
    private Set<String> set= new HashSet<String>();
    public TerminalExpression(String[] data){
        for(int i=0;i<data.length;i++)set.add(data[i]);
    }
    public boolean interpret(String address) {
        if(set.contains(address)){
            return true;
        }
        return false;
    }
}
