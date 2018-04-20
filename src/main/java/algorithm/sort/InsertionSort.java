package algorithm.sort;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/20.
 */
public class InsertionSort<T extends Comparable> implements Sortable<T> {

    /**
     * 排序算法，默认升序排列
     * <p>
     * 对象必须是可比较的
     *
     * @param array 未排序的数组
     */
    @Override
    public void sort(T[] array) {
        // TODO
    }

    /**
     * 获取排序算法名称
     *
     * @return
     */
    @Override
    public String getName() {
        return "Insertion Sort";
    }
}
