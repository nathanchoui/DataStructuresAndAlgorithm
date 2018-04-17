package collection.queue;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/17.
 */
public class QueueOverflowException extends RuntimeException {

    public QueueOverflowException() {}

    public QueueOverflowException(String message) {
        super(message);
    }
}
