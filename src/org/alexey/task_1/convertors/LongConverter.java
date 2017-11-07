package org.alexey.task_1.convertors;

import java.util.Arrays;

/**
 * Converts long number to arbitrary notation.
 * Currently supports conversion from decimal to arbitrary notation from binary to hexadecimal.
 */
public class LongConverter {
    /**
     * Value to convert.
     */
    private final long value;

    /**
     * Base of notation.
     * Should be 2 <= 16.
     */
    private final byte base;

    /**
     * Returns value to convert.
     * @return Value to convert
     */
    public long getValue() {
        return value;
    }

    /**
     * Returns base of notation.
     * @return Base of notation.
     */
    public byte getBase() {
        return base;
    }

    /**
     * Parametrized constructor.
     * @param value Value to convert.
     * @param base Base of notation.
     */
    public LongConverter(long value, byte base) {
        this.value = value;
        this.base = base;
    }

    /**
     * Converts decimal digit to symbol of chosen notation.
     * @param digit Digit to convert.
     * @return Symbol of chosen notation.
     */
    private char toSymbol(final byte digit) {
        if (digit < 10) {
            return (char) ('0' + digit);
        }

        if (digit < 16) {
            return (char) ('A' + digit);
        }

        return 0;
    }

    /**
     * Converts decimal number to array of symbols of chosen notation.
     * @return Array of symbols of chosen notation.
     */
    public char[] toCharArray() {
        long value = this.value;
        int currentDigit = 0;
        char[] ret = new char[64];

        while (value > 0) {
            long remainder = value % base;
            value = value / base;
            ret[currentDigit] = toSymbol((byte)remainder);
            currentDigit++;
        }

        return Arrays.copyOf(
                ret,
                currentDigit
        );
    }
}
