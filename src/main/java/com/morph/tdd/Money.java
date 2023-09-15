package com.morph.tdd;

public abstract class Money {
    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int multiplier);

    public boolean equals(Object object) {
        //getClass() 메소드는 runtime class를 리턴한다.
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }

    protected abstract String currency();
}
