package com.morph.tdd;

public class Franc extends Money{
    String currency;
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

    @Override
    protected String currency() {
        return this.currency;
    }
}