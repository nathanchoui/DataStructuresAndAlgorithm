package algorithm.sort;

/**
 * 冒泡排序算法
 * <p>
 * <p>
 * Created by zhangwei on 2018/4/19.
 */
public class BubbleSort<T extends Comparable> implements Sortable<T> {

    /**
     * 排序算法，默认升序排列
     * <p>
     * 对象必须是可比较的
     * <p>
     * 时间复杂度：
     * 最好：O(n) 已经是有序的情况下。
     * 最坏:O(n²)
     *
     * 空间复杂度
     * O(1)
     *
     * @param array 未排序的数组
     * @return 排完序的数组
     */
    @Override
    public void sort(T[] array) {
        if (array == null) {
            return;
        }
        // 是否发生置换的标志位，如果是已排序的，则可以只做一次循环
        boolean isSwapped = false;
        // 每次遍历最后一个元素是最大的。
        for (int i = array.length - 1; i >= 0 && !isSwapped; i--) {
            // 每次比较相邻的元素，最后那个即为最大的。
            for (int j = 0; j < i; j++) {
                // 如果前一个元素大于后一个元素，则互换位置,将大的值冒泡到最后
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }
    }

    /**
     * 获取排序算法名称
     *
     * @return
     */
    @Override
    public String getName() {
        return "Bubble Sort";
    }
}
