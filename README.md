# Introduction to Testing
This is a basic unit testing example with a class that performs basic math operations with robust unit testing.

In particular, the class features a method `MyMath.power(base, exponent)` that returns the value of `base` raised to the power `exponent`. This method was written without the use of the `Math` library, and thus, requires the user handle several edge cases in implementation and testing, including:

- Base raised to exponent 0.
- Base 0 raised to any exponent.
- Base raised to a negative exponent.
- Negative base raised to a negative exponent.

Several unit tests are defined in [`MyMathTest.java`](src/testingDemo/MyMathTest.java). 