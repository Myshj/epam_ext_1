package org.alexey.utils;

/**
 * Number related utility functions.
 */
public abstract class NumberRelated {

    /**
     * Returns true if number % divisor == 0.
     * @param number Number to divide.
     * @param divisor Divisor to divide number by.
     * @return true if number % divisor == 0.
     */
    public static boolean dividesBy(
            final long number,
            final long divisor
    ) {
        return number % divisor == 0;
    }

    /**
     * Checks if given number is prime.
     * @param number Number to check.
     * @return true if given number is prime.
     */
    public static boolean isPrime(
            final long number
    ) {
        for (long i = 2; i <= number / 2; i++) {
            if (dividesBy(number, i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Integer power.
     * @param base
     * @param exp
     * @return nteger power of base.
     */
    public static long pow(
            long base,
            long exp
    ) {
        long ret = 1;
        for (long i = 1; i <= exp; i++) {
            ret *= base;
        }
        return ret;
    }

    /**
     * Checks if given number is prime.
     * @param number Number to check.
     * @return true if given number is prime.
     */
    public static boolean isPerfect(final long number) {
        long sumOfDivisors = 0;
        if (number == 1) {
            return true;
        }
        for (long i = 1; i <= number / 2; i++) {
            if (NumberRelated.dividesBy(number, i)) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
}
