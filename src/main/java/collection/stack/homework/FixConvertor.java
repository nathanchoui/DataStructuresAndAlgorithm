package collection.stack.homework;

import collection.stack.MySimpleArrayStack;
import collection.stack.MyStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * 中缀表达式：
 *      (A + B) + (C - D)
 *
 *  前缀表达式：
 *      ++AB-CD
 *
 *  后缀表达式：
 *      AB+CD-+
 * <p>
 * Created by zhangwei on 2018/3/26.
 */
public class FixConvertor {

    private static final List<String> OPERANDS = Arrays.asList("+", "-", "*", "/");

    private static final List<String> START_BRACKETS = Arrays.asList("{", "[", "(");

    private static final List<String> END_BRACKETS = Arrays.asList("}", "]", ")");

    //private static final List<>

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
        Queue<String> stack = new ArrayDeque<>();
        if (!isLeagleExpression(nifixExp)) {
            return null;
        }
        for (String str : nifixExp) {
            // 判断是否是数字
            // TODO
            // 运算符 或者 左括号
            if (OPERANDS.contains(str)) {

            }

        }
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
