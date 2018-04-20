package algorithm.sort;

import algorithm.sort.Sortable;
import algorithm.sort.domain.Person;

/**
 * 选择排序法
 *
 * <p>
 * Created by zhangwei on 2018/4/20.
 */
public class SelectionSort<T extends Comparable> implements  Sortable<T> {
    /**
     * 排序算法，默认升序排列
     * <p>
     * 对象必须是可比较的
     *
     * @param array 未排序的数组
     */
    @Override
    public void sort(T[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                // 比最小值小
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // 与最小值交换
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * 获取排序算法名称
     *
     * @return
     */
    @Override
    public String getName() {
        return "Selection Sort";
    }
}
