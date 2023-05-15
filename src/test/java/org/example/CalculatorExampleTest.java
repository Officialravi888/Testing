package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorExampleTest {
    @Test
    void should_return_true_when_evaluate() {
        //given
        CalculatorExample calculator=new CalculatorExample();
        //when
        int sum=calculator.evaluate("1+2+3");
        //then
        assertEquals(6,sum);
    }
    @Test
    void should_return_not_equals_when_evaluate(){
        //given
        CalculatorExample calculator=new CalculatorExample();
        // when
        int sum=calculator.evaluate("2+3+4");
        //then
        assertNotEquals(10,sum);
    }

}