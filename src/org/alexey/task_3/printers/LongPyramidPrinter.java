package org.alexey.task_3.printers;

import org.alexey.Printer;
import org.alexey.task_3.pyramids.LongPyramid;
import org.alexey.task_4.matrices.LongMatrix;

/**
 * Prints given pyramid in the stdout.
 */
public class LongPyramidPrinter extends Printer {

    /**
     * Pyramid to print.
     */
    private final LongPyramid pyramid;

    /**
     * Returns pyramid to print.
     * @return Pyramid to print.
     */
    public LongPyramid getPyramid() {
        return pyramid;
    }

    /**
     * Parametrized constructor.
     * @param data Pyramid to print.
     */
    public LongPyramidPrinter(LongPyramid data) {

        this.pyramid = data;
    }

    /**
     * Prints given pyramid in the stdout.
     */
    @Override
    public void print() {
        final LongMatrix data = pyramid.getData();
        final int countOfRows = data.getCountOfRows();
        final int countOfColumns = data.getCountOfColumns();

        for (int row = 0; row < countOfRows; row++) {
            for (int column = 0; column < countOfColumns; column++) {
                long element = data.get(row, column);
                if (element == 0) {
                    System.out.print(' ');
                } else {
                    System.out.print(element);
                }

                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
