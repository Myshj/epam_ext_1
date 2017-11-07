package org.alexey;

import org.alexey.task_1.controllers.TaskOneController;
import org.alexey.task_2.controllers.TaskTwoController;
import org.alexey.task_3.controllers.TaskThreeController;
import org.alexey.task_4.controllers.TaskFourController;

/**
 * The main controller.
 * Runs all four tasks sequentially.
 */
public class MainController extends TaskController {

    /**
     * Default constructor.
     */
    public MainController() {
    }

    /**
     * Run all four tasks sequentially.
     */
    @Override
    public void doTask() {
        System.out.println("__Entered main task__");
        new TaskOneController().doTask();
        new TaskTwoController().doTask();
        new TaskThreeController().doTask();
        new TaskFourController().doTask();
        System.out.println("__Leaved main task__");
    }
}
