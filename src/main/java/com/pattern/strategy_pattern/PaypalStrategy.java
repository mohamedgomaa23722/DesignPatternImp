package com.pattern.strategy_pattern;

public class PaypalStrategy implements PaymentBehavior {
    private String emailAddress;
    private String password;

    public PaypalStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public boolean pay(int amount) {
        // TODO Auto-generated method stub
        System.out.println("successfull operation made with paypal for amount = " + amount);
        return true;
    }

}
