package collection.stack.homework;

import collection.stack.MySimpleArrayStack;
import collection.stack.MyStack;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/26.
 */
public class FixConvertor {

    private static final String[] OPERAND = {"+", "-", "*", "/"};

    private static final List<String> START_BRACKETS = Arrays.asList("{", "[", "(");

    private static final List<String> END_BRACKETS = Arrays.asList("}", "]", ")");
    /**
     * 判断是否是合法的中缀表达式
     *
     * @param expression
     * @return
     */
    public boolean isLeagleExpression(String[] expression) {
        // 数组长度有冗余
        MyStack<String> stack = new MySimpleArrayStack<String>(expression.length);
        for (String ch: expression) {
            if (START_BRACKETS.contains(ch)) {
                stack.push(ch);
            }
            else if (END_BRACKETS.contains(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return true;
    }

    /**
     * 中缀表达式转换成后缀表达式
     * @param nifixExp
     * @return
     */
    public String[] nifix2Postfix(String[] nifixExp) {


        return null;
    }

    /**
     * 计算后缀表达式的值
     *
     * @param postfixExp
     * @return
     */
    public Number caculatePostfix(String[] postfixExp) {
        return  null;
    }


    public static void main(String[] args) {
       FixConvertor fixConvertor = new FixConvertor();
       System.out.println(fixConvertor.isLeagleExpression(new String[]{"(", "a", ")"}));
    }


}
