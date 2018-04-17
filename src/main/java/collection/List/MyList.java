package collection.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/18.
 */
public interface MyList<AnyType> extends Iterable<AnyType>  {

    int size();

    boolean isEmpty();

    boolean add(AnyType anyType);

    boolean remove(Object object);

    boolean contains(Object object);

    AnyType get(int i);

}
