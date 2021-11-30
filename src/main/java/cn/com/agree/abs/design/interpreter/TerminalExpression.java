package cn.com.agree.abs.design.interpreter;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:21
 */
public class TerminalExpression  implements Expression {
    private String data;
    public TerminalExpression (String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
