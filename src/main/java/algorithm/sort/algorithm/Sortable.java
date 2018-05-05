package algorithm.sort.algorithm;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/19.
 */
public interface Sortable<T extends Comparable> {

    /**
     * 排序算法，默认升序排列
     *
     * 对象必须是可比较的
     *
     * @param array 未排序的数组
     */
    void sort(T[] array);

    /**
     * 获取排序算法名称
     * @return
     */
    String getName();
}
