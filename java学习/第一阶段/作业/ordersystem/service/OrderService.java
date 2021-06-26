package ordersystem.service;

import ordersystem.OrderApp;
import ordersystem.domain.Dishes;
import ordersystem.domain.Order;
import ordersystem.view.OrderView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 李春艳
 * @version 1.0
 */
public class OrderService {
    static HashMap<Integer, Order> map = new HashMap<>();
    public static List<Order> orderList = new ArrayList<>();
    private int orderID;//订单编号，自增长
    private int queueID;
    public static double discount = 1;
    private int memberID = 1000;
    public static int dnum1;
    public static LocalDateTime startTime;
    public static LocalDateTime finishTime;


    //点菜
    public boolean order(Dishes dishes, int dnum) {
        int index = -1;
        HashMap<Integer, Dishes> menu = OrderApp.menu;
        for (int i = 0; i < menu.size(); i++) {
            if (dishes.equals(menu.get(i + 1))) {
                index = i;
            }
            if (dnum > menu.get(i + 1).getDnum()) {
                return false;
            }
        }
        if (index == -1) {
            return false;
        }
        double price = menu.get(index + 1).getPrice() * dnum;
        dnum1 = menu.get(index + 1).getDnum();
        menu.get(index + 1).setDnum(dnum1 - dnum);

        (new OrderView()).balance -= price * discount;
        //订单生成和完成时间
        startTime = LocalDateTime.now();
        finishTime = startTime.plusMinutes(5);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String start = dateTimeFormatter.format(startTime);
        String finish = dateTimeFormatter.format(finishTime);
        Dishes dishes1 = menu.get(index + 1);
        Order order = new Order(++orderID, ++queueID, new Dishes(dishes1.getDname(), dishes1.getDtype(), dnum)
                , start, "待完成", finish, price, discount,
                price * discount, ++memberID + "");
        map.put(orderID, order);
        orderList.add(order);
        return true;
    }

    //充值
    public void recharge(double money) {
        if (money >= 1000) {
            System.out.println("恭喜成为金卡会员！打七折");
            discount = 0.7;
        } else if (money >= 500) {
            System.out.println("恭喜成为银卡会员！打八折");
            discount = 0.8;
        } else if (money >= 0) {
            System.out.println("恭喜成为普通会员！打九折");
            discount = 0.9;
        }
    }

    //查看订单
    public Order findByID(int queueID) {
        for (int i = 0; i < orderList.size(); i++) {
            if (queueID == i+1) {
                return orderList.get(i);
            }
        }
        return null;
    }

    //消费金额
    public double pay(int orderID) {
        return map.get(orderID).getActualPay();
    }
}
