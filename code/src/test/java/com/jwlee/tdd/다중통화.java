package com.jwlee.tdd;

import com.jwlee.tdd.Dollar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class 다중통화 {

    @Test
    @DisplayName("달러 금액을 주식 수에 곱한 금액을 반환한다.")
    void testDollarMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(five.times(2), new Dollar(10));
        assertEquals(five.times(3), new Dollar(15));
    }

    @Test
    @DisplayName("프랑 금액을 주식 수에 곱한 금액을 반환한다.")
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(five.times(2), new Franc(10));
        assertEquals(five.times(3), new Franc(15));
    }

    @Test
    @DisplayName("값 객체는 equals()를 갖는다.")
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
