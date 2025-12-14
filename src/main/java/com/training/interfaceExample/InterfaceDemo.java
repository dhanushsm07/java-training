package com.training.interfaceExample;

public class InterfaceDemo {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.pay(100);
        System.out.println(cc.paymentType());

        Upi upi = new Upi();
        upi.pay(10);
        System.out.println(upi.paymentType());
    }
}
