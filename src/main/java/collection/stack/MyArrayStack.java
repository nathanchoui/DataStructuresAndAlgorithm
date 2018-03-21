package collection.stack;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/21.
 */
public class MyArrayStack<E> implements MyStack {

    /**
     * 数组初始化容量
     */
    private final int DEFAULT_CAPACITY = 10;

    /**
     * 确保数组容量，待抽象出来
     *
     */
    void ensureCapacity() {

    }


    /**
     * 压栈
     *
     * @param data
     */
    @Override
    public void push(Object data) {

    }

    /**
     * 出栈
     *
     * @return
     */
    @Override
    public Object pop() {
        return null;
    }

    /**
     * 获取栈顶元素，不删除
     *
     * @return
     */
    @Override
    public Object top() {
        return null;
    }

    /**
     * 栈的大小
     *
     * @return
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return false;
    }
}
