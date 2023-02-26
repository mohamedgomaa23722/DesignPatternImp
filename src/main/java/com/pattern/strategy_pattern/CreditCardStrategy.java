package com.pattern.strategy_pattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String creditCardNumber;
    private String cvv;
    private String expireDate;

    public CreditCardStrategy(String name, String creditCardNumber, String cvv, String expireDate) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("successfull operation made with visa for amount = " + amount);
        return true;
    }

}
