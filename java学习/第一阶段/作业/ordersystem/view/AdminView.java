package ordersystem.view;

import ordersystem.utils.Utility;
import ordersystem.OrderApp;
import ordersystem.domain.Dishes;
import ordersystem.domain.Order;
import ordersystem.service.AdminService;
import ordersystem.service.OrderService;
import java.util.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class AdminView {
    private boolean loop = true;
    private char c = ' ';
    private AdminService adminService = new AdminService();

    //主菜单
    public void adminMenu() {
        do {
            System.out.println("\n=============管理界面============");
            System.out.println("\t\t\t1 设 置 打 折 菜 品");
            System.out.println("\t\t\t2 菜 品 剩 余 供 应 量");
            System.out.println("\t\t\t3 查 看 当 前 未 完 成 订 单");
            System.out.println("\t\t\t4 每 个 菜 品 销 售 情 况");
            System.out.println("\t\t\t5 每 天 营 收 额 情 况");
            System.out.println("\t\t\t6 近 期 爆 款 菜 品");
            System.out.println("\t\t\t7 每 天 赠 送 菜 品 详 情");
            System.out.println("\t\t\t8 每 天 每 单 的 等 待 时 间");
            System.out.println("\t\t\t9 退 出 管 理 系 统");
            System.out.print("请输入你的选择（1-8）：");
            c = Utility.readChar();
            switch (c) {
                case '1':
                    saleDish();
                    break;
                case '2':
                    leftNum();
                    break;
                case '3':
                    todoList();
                    break;
                case '4':
                    spendAccount();
                    break;
                case '5':
                    incomeOrder();
                    break;
                case '6':
                    hotDish();
                    break;
                case '7':
                    giveDishes();
                    break;
                case '8':
                    waitTime();
                    break;
                case '9':
                    exit();
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入");
            }
        } while (loop);
    }

    //1>设置打折菜品
    public void saleDish() {
        System.out.print("请输入你想设置的打折菜品编号");
        int dishID = Utility.readInt();
        System.out.print("打几折？");
        int discount = Utility.readInt();
        Dishes saleDish = adminService.sale(dishID, discount);
        if (saleDish == null) {
            System.out.println("您设置的菜品不存在，请重新输入");
            return;
        }
        System.out.println(saleDish);
    }

    //2>菜品剩余供应量
    public void leftNum() {
        System.out.print("请输入你想要查看剩余供应量的菜品编号（1-11）：");
        int dishID = Utility.readInt();
        if (dishID > 11) {
            System.out.println("该菜品不存在，请重新选择");
            return;
        }
        System.out.println("该菜品剩余供应量为：" + adminService.left(dishID));
    }

    //3>查看到当前时刻还没有完成的所有订单
    public void todoList() {
        System.out.println("==========================当前时刻未完成订单=========================");
        System.out.println("订单编号\t排队序号\t菜品详情\t订单生成时间\t订单状态(待完成/已完成)" +
                "\t订单完成时间\t订单总金额\t折扣信息\t实付款\t会员编号");
        List<Order> todo = adminService.todo();
        for (Order order : todo) {
            System.out.println(order);
        }
    }

    //4>统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序）
    public void spendAccount() {
        System.out.println("=============菜品营收情况============");
        System.out.println("菜品名称\t菜品消费量\t菜品营收额");
        double[][] spend = adminService.spend();
        //按消费份数排序
        Arrays.sort(spend, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o1[0] == o2[0]) {
                    return (int) (o1[1] - o2[1]);
                }
                return (int) (o1[0] - o2[0]);
            }
        });
        //打印排序后的菜品销售详情
        for (int i = 0; i < spend.length; i++) {
            for (int j = 0; j < spend[i].length; j++) {
                System.out.print(OrderApp.menu.get(i + 1).getDname() + "\t" + spend[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //5>统计每天总营收金额、单量、平均每单的消费额、总折扣金额（“每天”可通过设置系统时间进行模拟）
    public void incomeOrder() {
        System.out.println("=============每天营收情况============");
        System.out.println("每天营收总额\t单量\t平均每单消费额\t总折扣金额");
        double[] cal = adminService.cal();
        for (int i = 0; i < cal.length; i++) {
            System.out.print(cal[i] + "\t");
        }
    }

    //6>获取近期的爆款菜品（近5天被点份数最多的菜品）
    public void hotDish() {
        System.out.println("=============近期爆款菜品============");
        System.out.print("菜品名称:");
        Dishes hot = adminService.hot();
        System.out.println(hot.getDname());
    }

    //7>统计每天赠送的菜品详情
    public void giveDishes() {
        System.out.println("=============每天赠送菜品情况============");
        System.out.println("菜品名称\t菜品规格\t菜品单价");
        List<Dishes> free = adminService.give();
        for (int i = 0; i < free.size(); i++) {
            Dishes dish = free.get(i);
            System.out.println(dish.getDname() + "\t" + dish.getDtype() + "\t" + dish.getPrice());
        }
    }
    //8>统计每天每单的等待时间（支持排序）、平均等待时间
    public void waitTime() {
        System.out.println("=============等待时间统计============");
        System.out.println("订单编号\t等待时间");
        double[] waitTime = adminService.time();
        HashMap<Integer, Double> waitMap = new HashMap<>();
        for (int i = 0; i < waitTime.length; i++) {
            waitMap.put(OrderService.orderList.get(i).getOrderID(),waitTime[i]);
        }
        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(waitMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<Integer, Double> mapping:entries){
            System.out.println(mapping.getKey()+"\t"+mapping.getValue());
        }
    }
    //退出系统
    public void exit() {
        char ans = Utility.readConfirmSelection();
        if (ans == 'Y') {
            loop = false;
        }
    }
}
