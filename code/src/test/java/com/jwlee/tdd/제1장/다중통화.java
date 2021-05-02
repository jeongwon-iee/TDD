package com.jwlee.tdd.제1장;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class 다중통화 {
    @Test
    @DisplayName("금액을 주식 수에 곱한 금액을 반환한다.")
    void testMultiplication() {
        int price = 25;
        int numberOfStocks = 1000;
        int total = price * numberOfStocks;
        assertThat(total).isEqualTo(25000);
    }
}
