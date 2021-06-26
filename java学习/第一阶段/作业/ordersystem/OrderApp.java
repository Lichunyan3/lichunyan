package ordersystem;

import houserent.utils.Utility;
import ordersystem.domain.Admin;
import ordersystem.domain.Dishes;
import ordersystem.view.AdminView;
import ordersystem.view.OrderView;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 李春艳
 * @version 1.0
 */
public class OrderApp {
    //主类运行加载菜单
    public static HashMap<Integer, Dishes> menu;
    static {
        menu = new HashMap<>();
        menu.put(1,new Dishes("水饺","素三鲜",10,12));
        menu.put(2,new Dishes("水饺","酸菜油吱啦",10,12));
        menu.put(3,new Dishes("猪肉",null,10,16));
        menu.put(4,new Dishes("汤饺","素",10,5));
        menu.put(5,new Dishes("汤饺","肉",10,7));
        menu.put(6,new Dishes("米饭","小碗",10,2));
        menu.put(7,new Dishes("米饭","大碗",10,3));
        menu.put(8,new Dishes("鸡蛋炒面",null,10,6));
        menu.put(9,new Dishes("肉炒面",null,10,7));
        menu.put(10,new Dishes("小黄花","干炸",10,30));
        menu.put(11,new Dishes("小黄花","干煎",10,30));
        System.out.println("菜品编号\t菜名\t菜品规格\t菜品份数\t菜品单价");
        Set<Map.Entry<Integer, Dishes>> entries = menu.entrySet();
        for (Object entry:entries){
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
    }
    public static void main(String[] args) {
        new OrderView().orderMenu();
        System.out.println("您退出了点单系统,进入管理员界面");
        //登录校验
        while (true) {
            System.out.print("请输入姓名：");
            String name = Utility.readString(8);
            System.out.print("请输入密码：");
            String pwd = Utility.readString(6);
            if ("lcy".equals(name) && "123456".equals(pwd)) {
                System.out.println("=============登录管理员界面成功！============");
                new AdminView().adminMenu();
                break;
            }
            System.out.println("您输入的姓名或密码错误，请重新输入..");
        }
    }
}
