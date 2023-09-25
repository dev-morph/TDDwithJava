package com.morph.tdd;

import static org.junit.Assert.assertFalse;
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
    public void testEquality() {
        assertTrue(Money.franc(10).equals(Money.franc(10)));
        assertFalse(Money.franc(10).equals(Money.franc(6)));
        assertTrue(Money.dollar(10).equals(Money.dollar(10)));
        assertFalse(Money.dollar(10).equals(Money.franc(10)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        assertEquals(sum, Money.dollar(10));
    }
}
