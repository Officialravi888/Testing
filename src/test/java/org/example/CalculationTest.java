package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    public void addition_isCorrect(){
        //When
        //Then
        //assertEquals
        assertEquals(5, new Calculation().addTwoNumbers(2,3),0);
    }
    @Test
    public void subtraction_isCorrect(){
        assertEquals(5,new Calculation().subtractTwoNumbers(8,3),0);
    }
}