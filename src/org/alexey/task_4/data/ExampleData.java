package org.alexey.task_4.data;

import org.alexey.task_4.matrices.LongMatrix;

import java.util.Random;

public class ExampleData {
    private final LongMatrix simple = new LongMatrix(3, 3);

    public LongMatrix getSimple() {
        return simple;
    }

    public ExampleData() {
        fillSimple();
    }

    public void fillSimple(){
        Random r = new Random(135);
        for (int i = 0; i < simple.getCountOfRows(); i++){
            for(int j = 0; j < simple.getCountOfColumns(); j++){
                simple.set(
                        i,
                        j,
                       r.nextLong() % 10
                );
            }
        }
    }
}
