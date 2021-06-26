package ordersystem.view;

import ordersystem.utils.Utility;
import ordersystem.OrderApp;
import ordersystem.domain.Order;
import ordersystem.service.OrderService;

/**
 * @author 李春艳
 * @version 1.0
 * 显示界面
 */
public class OrderView {
    private boolean loop = true;
    private char c = ' ';
    private OrderService orderService = new OrderService();
    private double money;//充值金额
    public  double balance;//余额
    public static int dishNum;//点菜份数
    public static int choice;//免费赠送菜品编号

    //主菜单
    public void orderMenu() {
        do {
            System.out.println("\n=============点餐菜单============");
            System.out.println("\t\t\t1 点 餐");
            System.out.println("\t\t\t2 充 值");
            System.out.println("\t\t\t3 查 看 当 前 订 单");
            System.out.println("\t\t\t4 总 消 费 账 单");
            System.out.println("\t\t\t5 退      出");
            System.out.print("请输入你的选择（1-5）：");
            c = Utility.readChar();
            switch (c) {
                case '1':
                    orderDish();
                    break;
                case '2':
                    rechargeMoney();
                    break;
                case '3':
                    listOrder();
                    break;
                case '4':
                    payAccount();
                    break;
                case '5':
                    exit();
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入");
            }
        } while (loop);
    }

    //点单
    public void orderDish() {
        System.out.print("请输入您想选的菜品编号（1-11）：");
        int dishID = Utility.readInt();
        System.out.print("请输入您想选的菜品份数：");
        dishNum = Utility.readInt();
        boolean order = orderService.order(OrderApp.menu.get(dishID), dishNum);
        if (order) {
            System.out.println("点菜成功！稍等片刻..");
        } else {
            System.out.println("对不起，您点的菜本店没有或者供应量不足，请重新点菜");
        }
    }

    //充值
    public void rechargeMoney() {
        System.out.print("您是否需要充值？（y/n）");
        char ans = Utility.readConfirmSelection();
        System.out.print("请输入充值金额：");
        money = Utility.readInt();
        balance += money;
        if (ans == 'Y') {
            orderService.recharge(money);
        }
    }

    //查看当前订单
    public void listOrder() {
        System.out.print("请输入你要查看的订单的排队序号：");
        int queueID = Utility.readInt();
        System.out.println("==========================订单详情=========================");
        System.out.println("订单编号\t排队序号\t菜品详情\t订单生成时间\t订单状态(待完成/已完成)" +
                "\t订单完成时间\t订单总金额\t折扣信息\t实付款\t会员编号");
        Order order = orderService.findByID(queueID);
        if (order == null) {
            System.out.println("对不起，您查找的订单不存在");
            return;
        }
        System.out.println(order);
    }

    //总消费账单
    public void payAccount() {
        System.out.print("请输入订单编号：");
        int orderID = Utility.readInt();
        double pay = orderService.pay(orderID);
        if (pay >= balance) {
            System.out.print("您的余额不足，是否充值(y/n)");
            char ans = Utility.readConfirmSelection();
            if (ans == 'Y') {
                rechargeMoney();
            }
        }
        if (pay >= 100) {
            System.out.print("您的消费账单为（折扣前）：" + pay + "消费满100元，送上一份10元以内的菜品，请选择（4-9）");
            choice = Utility.readInt();
            System.out.println("您选择了一份" + OrderApp.menu.get(choice));
        }
    }

    //退出
    public void exit() {
        char ans = Utility.readConfirmSelection();
        if (ans == 'Y') {
            loop = false;
        }
    }
}
