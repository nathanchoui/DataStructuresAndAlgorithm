package algorithm.sort.algorithm.sort;

/**
 * @author nathan.z
 * @date 2019/8/1.
 */
public class BubbleSort<T extends Comparable> implements Sortable<T> {

    /**
     * 冒泡排序：
     * 每次子循环，将最大的元素沉底。
     *
     * 稳定排序
     * 空间复杂度：O(1) 原地排序
     * 时间复杂度:
     *  最好：O(n) 已经有序
     *  最坏：O(n^2) 倒叙排列的情况
     *  平均：O(n^2)
     *
     * @param array 未排序的数组
     */
    @Override
    public void sort(T[] array) {
        if (array == null
                || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            // 没有数据交换，提前退出
            if (!flag) {
                break;
            }
        }
    }


    @Override
    public String getName() {
        return null;
    }
}
