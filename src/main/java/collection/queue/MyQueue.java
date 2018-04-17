package collection.queue;

/**
 * Description:自定义队列结构
 * <p>
 * Created by zhangwei on 2018/4/17.
 */
public interface MyQueue<E> {

    /**
     * 在队尾添加元素
     * @param data
     */
    void add(E data);

    /**
     * 在队头删除元素
     * @return
     */
    E remove();

    /**
     * 返回队头元素
     * @return
     */
    E head();

    /**
     * 返回队列元素个数
     * @return
     */
    int size();

    /**
     * 返回是否为空
     * @return
     */
    boolean isEmpty();
}
