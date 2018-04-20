package collection.queue;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/18.
 */
public class Main {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyCircularArrayQueue<String>(5);
        queue.add("apple");
        queue.add("orange");
        queue.add("peach");
        queue.add("kiwi");
        //System.out.println("越界测试");
        queue.add("mango");
        System.out.println(queue);
        queue.remove();
        queue.remove();
//        queue.add("apple");
//        queue.add("orange");
        System.out.println(queue);
        //queue.add("cherry");
        //


    }
}
