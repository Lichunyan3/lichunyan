package ordersystem.domain;

/**
 * @author 李春艳
 * @version 1.0
 * 客户是否为会员
 */
public class User {
    private String name;
    private double rechargeAmount;//充值金额
    private double balance;//余额
    private enum Level{
        GOLD(0.7),SILVER(0.8),COMMON(0.9);
        private double discount;
        Level(double discount) {
            this.discount = discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
