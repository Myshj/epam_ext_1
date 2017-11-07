package org.alexey.task_4.rotators;

import org.alexey.task_4.matrices.LongMatrix;

/**
 * Rotates matrix 90 degrees left.
 */
public class LongMatrixLeftRotator {

    /**
     * Matrix to rotate.
     */
    private final LongMatrix matrix;

    /**
     * Returns matrix to rotate.
     * @return Matrix to rotate.
     */
    public LongMatrix getMatrix() {
        return matrix;
    }

    /**
     * Parametrized constructor.
     * @param matrix Matrix to rotate.
     */
    public LongMatrixLeftRotator(LongMatrix matrix) {

        this.matrix = matrix;
    }

    /**
     * Rotates matrix 90 degrees left.
     * @return Rotated matrix.
     */
    public LongMatrix rotate(){
        int countOfRows = matrix.getCountOfRows();
        int countOfColumns = matrix.getCountOfColumns();

        LongMatrix rotated = new LongMatrix(countOfRows, countOfColumns);

        for (int row = 0; row < countOfRows; row++){
            for (int column = 0; column < countOfColumns; column++){
                chooseElement(rotated, row, column, matrix);
            }
        }

        return rotated;
    }

    /**
     * Sets element with specified coordinates in the target matrix using original matrix.
     * @param target Matrix to set element in.
     * @param row Row of element.
     * @param column Column of element.
     * @param original Matrix to get element from.
     */
    private void chooseElement(
            LongMatrix target,
            int row,
            int column,
            LongMatrix original
    ){
        target.set(
                row, column,
                original.get(column, target.getCountOfRows() - row - 1)
        );
    }
}
