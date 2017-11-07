package org.alexey.task_4.matrices;

/**
 * Matrix of long integer numbers.
 */
public class LongMatrix {

    /**
     * Actual data is stored in this array.
     */
    private final long[] data;

    /**
     * Count of rows in matrix.
     */
    private final int countOfRows;

    /**
     * Count of columns in matrix.
     */
    private final int countOfColumns;

    /**
     * Is this matrix square [N x N]
     */
    private final boolean square;

    /**
     * Parametrized constructor.
     * @param countOfRows Count of rows in matrix.
     * @param countOfColumns Count of columns in matrix.
     */
    public LongMatrix(
            final int countOfRows,
            final int countOfColumns
    ) {
        this.countOfRows = countOfRows;
        this.countOfColumns = countOfColumns;
        data = new long[countOfRows * countOfColumns];
        square = countOfRows == countOfColumns;
    }

    /**
     * Gets element at the specified position.
     * @throws IndexOutOfBoundsException when indices are wrong.
     * @param row Row of element.
     * @param column Column of element.
     * @return Element.
     */
    public long get(
           final int row,
           final int column
    ){
        return data[toRealIndex(row, column)];
    }


    /**
     * Assigns new value to element at the specified position
     * @throws IndexOutOfBoundsException when indices are wrong.
     * @param row Row of element.
     * @param column Column of element.
     * @param value New value.
     */
    public void set(
            final int row,
            final int column,
            final long value
    ){
        data[toRealIndex(row, column)] = value;
    }

    /**
     * Is this matrix square [N x N]?
     * @return true if matrix is square
     */
    public boolean isSquare(){
        return square;
    }

    /**
     * Converts row and column to the internal data index.
     * @param row Row of element.
     * @param column Column of element.
     * @return Internal data index.
     */
    private int toRealIndex(
            final int row,
            final int column
    ){
        return row * countOfColumns + column;
    }

    /**
     * Returns count of rows in matrix.
     * @return Count of rows.
     */
    public int getCountOfRows() {

        return countOfRows;
    }

    /**
     * Returns count of columns in matrix.
     * @return Count of columns.
     */
    public int getCountOfColumns() {
        return countOfColumns;
    }
}
