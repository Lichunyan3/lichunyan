package ordersystem.domain;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 李春艳
 * @version 1.0
 * 菜品类
 * 菜品详情里应当包含菜名、规格、份数
 */
public class Dishes {
    private String dname;
    private String dtype;//规格
    private int dnum;//份数
    private double price;

    public Dishes(String dname, String dtype, int dnum, double price) {
        this.dname = dname;
        this.dtype = dtype;
        this.dnum = dnum;
        this.price = price;
    }

    public Dishes(String dname, String dtype, int dnum) {
        this.dname = dname;
        this.dtype = dtype;
        this.dnum = dnum;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return dname +"\t"
                + dtype +"\t"
                + dnum +"\t"
                + price ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dishes dishes = (Dishes) o;
        return dnum == dishes.dnum &&
                Double.compare(dishes.price, price) == 0 &&
                Objects.equals(dname, dishes.dname) &&
                Objects.equals(dtype, dishes.dtype);
    }
}
