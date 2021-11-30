package cn.com.agree.abs.design.interpreter;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:23
 */
public class OrExpression implements Expression{
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }


    @Override
    public boolean interpreter(String context) {
        return expr1.interpreter(context)|| expr2.interpreter(context);
    }
}
