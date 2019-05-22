package collection.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/18.
 */
public abstract class MyAbstractList<E> implements MyList<E> {

    protected int length = 0;

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

}
