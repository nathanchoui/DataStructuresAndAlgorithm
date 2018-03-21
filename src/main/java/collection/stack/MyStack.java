package collection.stack;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/21.
 */
public interface MyStack<E> {

    /**
     * 压栈
     *
     * @param data
     */
    void push(E data);

    /**
     * 出栈
     *
     * @return
     */
    E pop();

    /**
     * 获取栈顶元素，不删除
     *
     * @return
     */
    E top();

    /**
     * 栈的大小
     *
     * @return
     */
    int size();

    /**
     *判断栈是否为空
     *
     * @return
     */
    boolean isEmpty();


}
