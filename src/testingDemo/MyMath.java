package testingDemo;

/**
 * Utility class for basic math operations.
 */
public class MyMath {

    /**
     * Adds two integers together.
     * @param number1 the first integer
     * @param number2 the second integer
     * @return the result of adding two integers
     */
    public static int add(int number1, int number2) {
        return number1 + number2;
    }


    /**
     * Computes the power of a base raised to an exponent without using Math.pow().
     * @param base the base number
     * @param exponent the exponent to raise the base to
     * @return the result of base raised to the power of exponent
     */
    public static double power(int base, int exponent) {
        // Handle case where exponent is 0
        if (exponent == 0) {
            return 1;
        }
    
        int positiveExponent = Math.abs(exponent);  // Get absolute value of exponent
        double result = 1;
        
        // Multiply base positiveExponent number of times
        for (int i = 0; i < positiveExponent; i++) {
            result = result * base;
        }
        
        // If the original exponent is negative, return the reciprocal
        if (exponent < 0) {
            return 1.0 / result;
        }
        
        return result;
    }
    
}