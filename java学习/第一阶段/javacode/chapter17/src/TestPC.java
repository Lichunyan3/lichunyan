import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author 李春艳
 * @version 1.0
 */
public class TestPC {
    public static final int MAX_POOL=10;
    public static final int MAX_PRODUCER=5;
    public static final int MAX_CONSUMER=4;
    public static Queue<Goods> queue = new ArrayBlockingQueue<>(MAX_POOL);
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        for (int i = 0; i < MAX_PRODUCER; i++) {
            new Thread(producer,"生产者线程"+i).start();
        }
        for (int i = 0; i < MAX_CONSUMER; i++) {
            new Thread(consumer,"消费者线程"+i).start();
        }
    }
}
