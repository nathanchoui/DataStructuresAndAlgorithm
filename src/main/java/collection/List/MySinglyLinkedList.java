package collection.List;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
            this.index = index;
            this.data = data;
        }
    }


    @Override
    public boolean add(E e) {
        ListNode node = new ListNode(length, e);
        if (tailNode == null) {
            headNode = node;
        }
        else {
            tailNode.next = node;
        }
        tailNode = node;
        return true;
    }

    /**
     * 如果根据节点内容做删除，链表性能不好
     *
     * @param object
     * @return
     */
    @Override
    public boolean remove(Object object) {
        if (object == null || headNode == null) {
            return false;
        }
        ListNode<E> previousNode = null;
        ListNode<E> itNode = null;
        if (headNode.data.equals((E)object)) {
            headNode = headNode.next;
            return true;
        }
        previousNode = headNode;
        itNode = headNode;
        while ((itNode = itNode.next) != null) {
            if (itNode.data.equals((E)object)) {
                previousNode.next = itNode.next;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        if (headNode.data.equals((E)object)) {
            return true;
        }
        ListNode<E> itNode = headNode;
        while ((itNode = itNode.next) != null) {
            if (itNode.data.equals((E)object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public E get(int i) {
        if (headNode.index == i) {
            return headNode.data;
        }
        ListNode<E> itNode = headNode;
        while ((itNode = itNode.next) != null) {
           if (itNode.index == i) {
               return itNode.data;
           }
        }
        return null;
    }

    private class LinkedListIterator implements Iterator<E> {

        private ListNode<E> currentNode = null;

        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                if (headNode == null) {
                    return false;
                }
                else {
                    return true;
                }
            }
            else {
                return currentNode.next != null;
            }
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public E next() {
            if (currentNode == null) {
                if (headNode == null) {
                    throw new NoSuchElementException();
                }
                else {
                    currentNode = headNode;
                    return currentNode.data;
                }
            }
            if (currentNode.next == null) {
                throw new NoSuchElementException();
            }
            else {
                currentNode = currentNode.next;
                return currentNode.data;
            }
        }
    }

    public static void main (String[] args) {
        MyList<String> list = new MySinglyLinkedList<>();
        // 测试add
        list.add("A");
        list.add("B");
        list.add("C");
        //  测试remove
        list.remove("A");
        //   和 迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // 测试contains
        if (list.contains("B")) {
            System.out.println("list contains " + "B");
        }
        // 测试get
        System.out.println("get 0 :" + list.get(0));
    }
}

