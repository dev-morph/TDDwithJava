package com.morph.tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ch1TDDTests {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Boolean.TRUE, Money.dollar(5).equals(Money.dollar(5)));
        assertEquals(Boolean.FALSE, Money.dollar(6).equals(Money.dollar(5)));
        assertEquals(Boolean.TRUE, Money.franc(5).equals(Money.franc(5)));
        assertEquals(Boolean.FALSE, Money.franc(6).equals(Money.franc(5)));
        assertEquals(Boolean.FALSE, Money.franc(6).equals(Money.dollar(6)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}