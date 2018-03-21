package collection;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/3/21.
 */
public class DynamicArray<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int maxCapacity;

    private transient Object[] array;

    public DynamicArray() {
        this.maxCapacity = DEFAULT_CAPACITY;
        this.array = new Object[maxCapacity];
    }

    public DynamicArray(int initCapacity) {
        if (initCapacity > 0) {
            this.maxCapacity = initCapacity;
            this.array = new Object[maxCapacity];
        } else if (initCapacity == 0) {
            this.array = new Object[]{};
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initCapacity);
        }
    }

    /**
     * 确保容量
     */
    protected void ensureCapacity() {

    }

}
