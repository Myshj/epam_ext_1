package org.alexey.task_2.finders;

import java.util.Arrays;

import static org.alexey.utils.NumberRelated.isPrime;
import static org.alexey.utils.NumberRelated.pow;

/**
 * Finds perfect numbers using Euclidian formulae.
 */
public class ProgressivePerfectNumberFinder extends PerfectNumberFinder {

    /**
     * Given exponent calculate possible perfect number.
     * @param exp Exponent
     * @return Possible perfect number.
     */
    private long calculateCandidate(
            final int exp
    ) {
        return pow(2, exp - 1) * (pow(2, exp) - 1);
    }

    /**
     * Given exponent calculate base for possible perfect number.
     * @param exp Exponent
     * @return Base for possible perfect number.
     */
    private long calculateBase(
            final int exp
    ) {
        return pow(2, exp) - 1;
    }

    @Override
    public long[] findAll() {
        long[] found = new long[100];
        int currentIndex = 0;

        for (int i = 1; i < 31; i++) {
            long candidate = calculateCandidate(i);
            if (candidate > max) {
                break;
            }
            if (isPrime(calculateBase(i))) {

                found[currentIndex] = candidate;
                currentIndex++;
            }
        }
        return Arrays.copyOf(
                found,
                currentIndex
        );
    }

    public ProgressivePerfectNumberFinder(long max) {
        super(max);
    }


}
