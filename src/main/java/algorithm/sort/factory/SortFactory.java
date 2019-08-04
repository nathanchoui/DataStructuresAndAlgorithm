package algorithm.sort.factory;

import algorithm.sort.algorithm.sort.Sortable;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/29.
 */
public interface SortFactory<T extends Comparable> {

    Sortable<T> getSort();

}
