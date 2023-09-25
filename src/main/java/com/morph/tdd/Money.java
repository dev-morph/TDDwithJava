package com.morph.tdd;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    protected String currency() {
        return this.currency;
    };

    protected Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    public boolean equals(Object object) {
        //getClass() 메소드는 runtime class를 리턴한다.
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
    public String toString() {
        return amount + " " + currency;
    }
}
