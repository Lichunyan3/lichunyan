/**
 * @author 李春艳
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ScheduleThreadTest {

    private static final AtomicReference<List<Integer>> list = new AtomicReference<>(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {
        // 线程池执行定时任务
        ScheduledThreadPoolExecutor schedule = new ScheduledThreadPoolExecutor(1);

        schedule.scheduleWithFixedDelay(() -> {
            // 每隔5秒生成3个1-10的数字,放进list里面
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < 3; ++i) {
                integers.add(new Random().nextInt(10));
            }
            list.set(integers);
            System.out.println("now list = " + integers.toString());

        }, 0, 5, TimeUnit.SECONDS);

        // 测试程序,每一秒测试一下2是否在当前的list中.
        while (true) {
            int target = 2;
            System.out.println(list.get().contains(target));
            Thread.sleep(1000);
        }
    }

}