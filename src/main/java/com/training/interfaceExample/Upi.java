package com.training.interfaceExample;

public class Upi implements PaymentMethod{

    @Override
    public boolean pay(int amount) {
        if(amount>0){
            System.out.println(amount + "rs is paid");
            return true;
        }
        return false;
    }

    @Override
    public String paymentType() {
        return "UPI";
    }
}
