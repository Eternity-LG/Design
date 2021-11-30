package cn.com.agree.abs.design.interpreter;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-30 16:29
 */
public class InterpretDemo {

        //规则：Robert 和 John 是男性
        public static Expression getMaleExpression(){
            Expression robert = new TerminalExpression("Robert");
            Expression john = new TerminalExpression("John");
            return new OrExpression(robert, john);
        }

        //规则：Julie 是一个已婚的女性
        public static Expression getMarriedWomanExpression(){
            Expression julie = new TerminalExpression("Julie");
            Expression married = new TerminalExpression("Married");
            return new AndExpression(julie, married);
        }

        public static void main(String[] args) {
            Expression isMale = getMaleExpression();
            Expression isMarriedWoman = getMarriedWomanExpression();

            System.out.println("John is male? " + isMale.interpreter("John"));
            System.out.println("Julie is a married women? "
                    + isMarriedWoman.interpreter("Married Julie"));
        }
}
