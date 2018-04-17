package collection.queue;

/**
 * 用简单循环数组实现队列，固定大小。
 * <p>
 * Created by zhangwei on 2018/4/17.
 */
public class MyCircularArrayQueue<E> implements MyQueue<E> {

    /**
     * 队头指针
     */
    private int front;

    /**
     * 队尾指针
     */
    private int rear;

    /**
     * 队列的容量
     */
    private int capacity;

    /**
     * 存放元素的数组
     */
    private Object[] array;


    public MyCircularArrayQueue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        array = new Object[capacity];
    }

    /**
     * 在队尾添加元素
     *
     * @param data
     */
    public void add(E data) {

    }

    /**
     * 在队头删除元素
     *
     * @return
     */
    public E remove() {
        return null;
    }

    /**
     * 返回队头元素
     *
     * @return
     */
    public E head() {
        return null;
    }

    /**
     * 返回队列元素个数
     *
     * @return
     */
    public int size() {
        return 0;
    }

    /**
     * 返回是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }
}
