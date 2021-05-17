package com.lcy.poly.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2300);
        Manager jack = new Manager("jack", 5000, 100000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(jack);
        polyParameter.testWork(tom);
        polyParameter.testWork(jack);
        "hello".equals("hello");

    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
