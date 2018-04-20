package collection.queue;

import collection.queue.exception.QueueEmptyException;
import collection.queue.exception.QueueOverflowException;

import java.util.Arrays;

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
        if (isFull()) {
            throw new QueueOverflowException("Queue Overflow");
        }
        rear = (rear + 1) % capacity;
        array[rear] = data;
        if (front == -1) {
            front = rear;
        }
    }

    /**
     * 在队头删除元素
     *
     * @return
     */
    public E remove() {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue Empty");
        }
        Object data = array[front];
        // 此时队列正好是满状态
        if (front == rear) {
            front = rear - 1;
        }
        // 数组里数据还在，只是移动了头指针。
        else {
            front = (front + 1) % capacity;
        }
        return (E)data;
    }

    /**
     * 返回队头元素
     *
     * @return
     */
    public E head() {
        return (E) array[front];
    }

    /**
     * 返回队列元素个数
     *
     * @return
     */
    public int size() {
        return (capacity - front + rear + 1) % capacity;
    }

    /**
     * 返回是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    @Override
    public String toString() {
        return "MyCircularArrayQueue{" +
                "front=" + front +
                ", rear=" + rear +
                ", capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
