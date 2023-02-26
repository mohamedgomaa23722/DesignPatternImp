package com.pattern.strategy_pattern.model;

import com.pattern.strategy_pattern.PaymentBehavior;

public class User {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private PaymentBehavior paymentBehavior;
    private Cart cart;

    public User(String name, String phoneNumber, String emailAddress, PaymentBehavior paymentBehavior, Cart cart) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.paymentBehavior = paymentBehavior;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
        this.paymentBehavior = paymentBehavior;
    }

    public void pay() {
        paymentBehavior.pay(cart.calculateTotalAmount());
    }  


}
