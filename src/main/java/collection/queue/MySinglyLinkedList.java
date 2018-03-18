package collection.queue;

import java.util.Iterator;

/**
 * Description: 单向链表的实现。
 * <p>
 * Created by nathan.z on 2018/3/18.
 */
public class MySinglyLinkedList<E> extends MyAbstractList<E> {

    private ListNode<E> headNode = null;
    private ListNode<E> tailNode = null;

    /**
     * 节点数据模型
     *
     * @param <E>
     */
    public class ListNode<E> {
        private int index;
        private E data;
        private ListNode<E> next;
        public ListNode(int index, E data) {
            this.data = data;
        }

        public void setNext(ListNode nextNode) {
            this.next = nextNode;
        }
    }


    @Override
    public boolean add(E e) {
        ListNode node = new ListNode(length, e);
        if (tailNode == null) {
            headNode = node;
        }
        else {
            tailNode.setNext(node);

        }
        tailNode = node;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public E get(int i) {
        return null;
    }
}

