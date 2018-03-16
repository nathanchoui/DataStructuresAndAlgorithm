package collection.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/9.
 */
public class CircularArrayQueue<AnyType> implements Queue<AnyType> {


    private int head;

    private int tail;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<AnyType> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(AnyType anyType) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends AnyType> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public boolean offer(AnyType anyType) {
        return false;
    }

    public AnyType remove() {
        return null;
    }

    public AnyType poll() {
        return null;
    }

    public AnyType element() {
        return null;
    }

    public AnyType peek() {
        return null;
    }
}
