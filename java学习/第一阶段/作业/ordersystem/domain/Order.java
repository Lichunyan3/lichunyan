package ordersystem.domain;

/**
 * @author 李春艳
 * @version 1.0
 * 订单类
 */
public class Order {
    private int orderID;
    private int queueID;
    private Dishes dishes;
    private String startTime;
    private String state;
    private String finishTime;
    private double orderPrice;
    private double sale;//折扣信息
    private double actualPay;
    private String memberNumber;

    public Order(int orderID, int queueID, Dishes dishes, String startTime,
                 String state, String finishTime, double orderPrice, double sale,
                 double actualPay, String memberNumber) {
        this.orderID = orderID;
        this.queueID = queueID;
        this.dishes = dishes;
        this.startTime = startTime;
        this.state = state;
        this.finishTime = finishTime;
        this.orderPrice = orderPrice;
        this.sale = sale;
        this.actualPay = actualPay;
        this.memberNumber = memberNumber;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getQueueID() {
        return queueID;
    }

    public void setQueueID(int queueID) {
        this.queueID = queueID;
    }

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getActualPay() {
        return actualPay;
    }

    public void setActualPay(double actualPay) {
        this.actualPay = actualPay;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Override
    public String toString() {
        return  orderID + "\t"+
                queueID +"\t"+
                dishes +"\t"
                + startTime +"\t"
                + state + "\t" +
                 finishTime +"\t"
                + orderPrice +"\t"
                + sale +"\t"
                + actualPay +"\t"
                + memberNumber;
    }
}
