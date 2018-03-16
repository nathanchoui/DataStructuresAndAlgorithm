package collection.main;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/3/11.
 */
public class MainTest {

    public static void main(String[] args) {
        List<String> arrs = Arrays.asList("a", "b", "c");
        arrs.iterator().forEachRemaining(element -> System.out.println(element));

    }
}
