package com.jwlee.tdd;

import com.jwlee.tdd.Dollar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class 다중통화 {

    @Test
    @DisplayName("금액을 주식 수에 곱한 금액을 반환한다.")
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(10).isEqualTo(product.amount);
        product = five.times(3);
        assertThat(15).isEqualTo(product.amount);
    }
}
