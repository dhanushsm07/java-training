package com.training.interfaceExample;

public interface PaymentMethod {
    boolean pay(int amount);
    String paymentType();
}
