package ordersystem.service;

import ordersystem.OrderApp;
import ordersystem.domain.Dishes;
import ordersystem.domain.Order;
import ordersystem.view.OrderView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * @author 李春艳
 * @version 1.0
 */
public class AdminService {
    int size = OrderApp.menu.size();
    int size1 = OrderService.orderList.size();
    int total;//菜品被点数量

    //打折菜品
    public Dishes sale(int dishID, int discount) {
        if (dishID <= OrderApp.menu.size()) {
            Dishes dish = OrderApp.menu.get(dishID);
            dish.setPrice(dish.getPrice() * discount / 10);
            return dish;
        }
        return null;
    }

    //根据菜品编号查剩余供应
    public int left(int dishID) {
        return OrderApp.menu.get(dishID).getDnum();
    }

    //未完成订单
    public List<Order> todo() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//格式化
        String now = dateTimeFormatter.format(time);
        List<Order> orders = new ArrayList<>();
        for (Order order : OrderService.orderList) {
            if (now.compareTo(order.getFinishTime()) < 0) {
                orders.add(order);
            }
        }
        return orders;
    }

    //统计每个菜品的消费量和金额
    public double[][] spend() {
        double[][] totalSpend = new double[size][2];
        for (int i = 1; i <= size; i++) {
            total = OrderService.dnum1 - left(i);
            totalSpend[i - 1][0] = total;
            totalSpend[i - 1][1] = total * OrderApp.menu.get(i).getPrice() * OrderService.discount;
        }
        return totalSpend;
    }

    //统计每天总营收金额、单量、平均每单的消费额、总折扣金额（“每天”可通过设置系统时间进行模拟）
    public double[] cal() {
        double[] sum = new double[4];

        for (int i = 1; i <= size; i++) {
            double actualPay = OrderService.orderList.get(i).getActualPay();//实付金额
            sum[0] += actualPay;
            sum[2] = OrderService.orderList.get(i).getOrderPrice()-actualPay;//总折扣金额
        }
        sum[1]=size1;
        try {
            sum[2] = sum[0]/sum[1];
        } catch (ArithmeticException e) {
            System.out.println("分母不能为0");
        }
        return sum;
    }

    //获取爆款菜品（近5天被点份数最多的菜品）
    public Dishes hot() {
        int[] totalNum = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            total = OrderService.dnum1 - left(i);
            totalNum[i] = total;
        }
        for (int i = 0; i < size; i++) {
            if (totalNum[i]<totalNum[i+1]){
                max = i+1;
            }
        }
        return OrderApp.menu.get(max);
    }

    //赠送菜品
    public List<Dishes> give(){
        List<Dishes> freeDishes = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < size1; i++) {
            freeDishes.add(OrderApp.menu.get(OrderView.choice));
            //如果不同订单赠送菜品相同，如何进行份数叠加而不是重复罗列？
        }
        return freeDishes;
    }

    //统计每天每单的等待时间（支持排序）、平均等待时间
    public double[] time() {
        double[] waitTime = new double[size1];
        for (int i = 0; i < size1; i++) {
            Order order = OrderService.orderList.get(i);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //相差毫秒数
            long m = 0;
            try {
                m = sdf.parse(order.getFinishTime()).getTime()-sdf.parse(order.getStartTime()).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            double s = m/1000;//秒
            waitTime[i] = s;
        }
        return waitTime;
    }
}
