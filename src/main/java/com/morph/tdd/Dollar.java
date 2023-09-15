package com.morph.tdd;

public class Dollar extends Money{
    String currency;
    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

    @Override
    protected String currency() {
        return this.currency;
    }
}