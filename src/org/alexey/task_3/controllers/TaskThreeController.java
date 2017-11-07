package org.alexey.task_3.controllers;

import org.alexey.TaskController;
import org.alexey.task_3.printers.LongPyramidPrinter;
import org.alexey.task_3.pyramids.LongPyramid;

public class TaskThreeController extends TaskController {
    @Override
    public void doTask() {
        System.out.println("_Entered task 3_");
        new LongPyramidPrinter(
                new LongPyramid(3)
        ).print();
        System.out.println("_Leaved task 3_");
    }

    public TaskThreeController() {
    }
}
