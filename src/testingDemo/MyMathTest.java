package testingDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void add_shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }
    
    @Test
    public void power_shouldReturnPower_whenExponentPositive() {
        assertEquals(8, MyMath.power(2, 3));
    }

    @Test
    public void power_shouldReturn1_whenExponent0() {
        assertEquals(1, MyMath.power(10, 0));
    }

    @Test
    public void power_shouldReturn0_whenBase0() {
        assertEquals(0, MyMath.power(0, 2));
    }

    @Test
    public void power_shouldReturnResult_whenExponentNegative() {
        assertEquals(0.125, MyMath.power(2, -3));
    }

    @Test
    public void power_shouldReturnResult_whenBothNegative() {
        assertEquals(-0.125, MyMath.power(-2, -3));
    }

}





