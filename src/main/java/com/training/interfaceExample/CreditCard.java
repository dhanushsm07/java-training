package com.training.interfaceExample;

public class CreditCard implements PaymentMethod{

    @Override
    public boolean pay(int amount) {
        if(amount > 0){
            System.out.println(amount + "rs paid");
        }
        return false;
    }

    @Override
    public String paymentType() {
        return "Credit Card";
    }
}
