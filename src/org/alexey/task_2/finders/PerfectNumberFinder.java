package org.alexey.task_2.finders;

/**
 * Base class for all perfect number finders.
 */
public abstract class PerfectNumberFinder {

    /**
     * Max bound for search.
     */
    protected long max;

    /**
     * Parametrized constructor.
     * @param max Max bound for search.
     */
    public PerfectNumberFinder(long max) {
        this.max = max;
    }

    /**
     * Returns max bound for search.
     * @return Max bound for search.
     */
    public long getMax() {
        return max;
    }

    /**
     * Returns all perfect numbers from [0, max)
     * @return All perfect numbers from [0, max)
     */
    public abstract long[] findAll();

}
