package org.alexey.task_2.finders;

import java.util.Arrays;

import static org.alexey.utils.NumberRelated.isPerfect;

/**
 * Finds perfect numbers using brute force.
 */
public class NaivePerfectNumberFinder extends PerfectNumberFinder {
    @Override
    public long[] findAll() {
        long[] ret = new long[10];
        int currentIndex = 0;
        for (long i = 1; i < max; i++) {
            if (isPerfect(i)) {
                ret[currentIndex] = i;
                currentIndex++;
            }
        }
        return Arrays.copyOf(ret, currentIndex);
    }

    public NaivePerfectNumberFinder(long max) {
        super(max);
    }
}
