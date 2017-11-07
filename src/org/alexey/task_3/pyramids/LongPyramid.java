package org.alexey.task_3.pyramids;

import org.alexey.task_4.matrices.LongMatrix;

/**
 * Pyramid of long elements.
 */
public class LongPyramid {
    /**
     * Actual matrix of elements.
     */
    private final LongMatrix data;

    /**
     * Height of this pyramid. Convenience variable.
     */
    private final int height;

    /**
     * Number of the pivotal center column of this pyramid.
     */
    private final int centerColumn;

    /**
     * Returns pivotal center column of this pyramid.
     * @return Pivotal center column of this pyramid.
     */
    public int getCenterColumn() {
        return centerColumn;
    }

    /**
     * Returns height of this pyramid.
     * @return Height of this pyramid.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Parametrized constructor.
     * @param height Height of this pyramid.
     */
    public LongPyramid(
            final int height
    ) {
        this.height = height;
        data = new LongMatrix(height, height * 2 - 1);
        centerColumn = height - 1;
        build();
    }

    /**
     * Build pyramid using given height.
     */
    private void build(){
        for(int row = 1; row <= height; row++){
            for (int number = 1; number <= row; number++){
                data.set(
                        row - 1,
                        centerColumn - row + number,
                        number
                );
                data.set(
                        row - 1,
                        height + row - number - 1,
                        number
                );
            }
        }
    }

    /**
     * Returns actual matrix of elements.
     * @return Actual matrix of elements
     */
    public LongMatrix getData() {

        return data;
    }
}
