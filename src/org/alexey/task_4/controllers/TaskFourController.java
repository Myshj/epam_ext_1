package org.alexey.task_4.controllers;

import org.alexey.TaskController;
import org.alexey.task_4.data.ExampleData;
import org.alexey.task_4.printers.LongMatrixPrinter;
import org.alexey.task_4.rotators.LongMatrixLeftRotator;

public class TaskFourController extends TaskController {

    public TaskFourController() {
    }

    @Override
    public void doTask(){
        System.out.println("_Entered task 4");
        ExampleData data = new ExampleData();

        System.out.println("Original matrix:");
        new LongMatrixPrinter(
                data.getSimple()
        ).print();

        System.out.println("Rotated matrix:");
        new LongMatrixPrinter(
                new LongMatrixLeftRotator(
                        data.getSimple()
                ).rotate()
        ).print();
        System.out.println("_Leaved task 4_");
    }
}
