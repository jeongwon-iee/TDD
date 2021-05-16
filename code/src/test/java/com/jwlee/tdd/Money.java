package com.jwlee.tdd;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && this.currency.equals(money.currency);
    }

    public String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
