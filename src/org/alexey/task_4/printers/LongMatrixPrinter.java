package org.alexey.task_4.printers;

import org.alexey.Printer;
import org.alexey.task_4.matrices.LongMatrix;

/**
 * Prints given matrix in the stdout.
 */
public class LongMatrixPrinter extends Printer {

    /**
     * Matrix to print.
     */
    private final LongMatrix matrix;

    /**
     * Parametrized constructor.
     * @param matrix Matrix to print.
     */
    public LongMatrixPrinter(LongMatrix matrix) {
        this.matrix = matrix;
    }

    /**
     * Get matrix to print.
     * @return Matrix to print.
     */
    public LongMatrix getMatrix() {
        return matrix;
    }

    /**
     * Prints specified matrix to stdout.
     */
    @Override
    public void print(){
        int countOfRows = matrix.getCountOfRows();
        int countOfColumns = matrix.getCountOfColumns();

        for(int row = 0; row < countOfRows; row++){
            for (int column = 0; column < countOfColumns; column++){
                System.out.print(matrix.get(row, column));
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
