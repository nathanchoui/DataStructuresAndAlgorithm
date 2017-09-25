package personal.person.charactor3.list;

import java.util.Iterator;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/9.
 */
public class MyArrayList<AnyType> implements Iterable<AnyType> {

    private static final int DEFAULT_CAPACITY = 10;
    private AnyType[] theItems;

    private int theSize;

    public MyArrayList() {

    }

    public int size() {
        return theSize;
    }

    private void doClear() {

    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) {
            return;
        }
        AnyType[] old = theItems;
        theItems = (AnyType[]) new Object[newCapacity];
        for (int i = 0; i < size(); i ++) {
            theItems[i] = old[i];
        }
    }

    public Iterator<AnyType> iterator() {
        return null;
    }

}
