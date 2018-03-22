package collection.stack;

/**
 * Description:利用数组实现栈，不支持动态扩充容量。
 * <p>
 * Created by zhangwei on 2018/3/21.
 */
public class MySimpleArrayStack<E> implements MyStack {

    /**
     * 数组初始化容量
     */
    //private final int DEFAULT_CAPACITY = 10;

    private Object[] array;

    private int index = -1;

    public MySimpleArrayStack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("stack size must be greater than zero.");
        }
        array = new Object[size];
    }

    /**
     * 压栈
     *
     * @param data
     */
    @Override
    public void push(Object data) {
        if (index < array.length - 1) {
            this.array[++ index] = data;
        }
    }

    /**
     * 出栈
     *
     * @return
     */
    @Override
    public E pop() {
        if (index >= 0) {
            return (E) array[index--];
        }
        return null;
    }

    /**
     * 获取栈顶元素，不删除
     *
     * @return
     */
    @Override
    public E top() {
        if (index >= 0) {
            return (E) array[index];
        }
        return null;
    }

    /**
     * 栈的大小
     *
     * @return
     */
    @Override
    public int size() {
        return index + 1;
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return index < 0 ? true : false;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MySimpleArrayStack<>(3);
        stack.push(15);
        stack.push(27);
        stack.push(45);
        stack.push(20);
        System.out.println("top: " + stack.top());
        System.out.println("pop: " + stack.pop());
        System.out.println("after pop() method was invoked, isEmpty(): " + stack.isEmpty());
        System.out.println("size: " + stack.size());
    }


}
