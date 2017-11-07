package org.alexey.task_2.controllers;

import org.alexey.TaskController;
import org.alexey.task_2.data.ExampleData;
import org.alexey.task_2.finders.NaivePerfectNumberFinder;
import org.alexey.task_2.finders.ProgressivePerfectNumberFinder;

import java.util.Arrays;

public class TaskTwoController extends TaskController {
    @Override
    public void doTask() {
        System.out.println("_Entered task 2_");

        ExampleData data = new ExampleData();

        System.out.println("Naive approach:");

        System.out.println(
                Arrays.toString(
                        new NaivePerfectNumberFinder(
                                data.getMaxForNaive()
                        ).findAll()
                )
        );

        System.out.println("Progressive approach:");
        System.out.println(
                Arrays.toString(
                        new ProgressivePerfectNumberFinder(
                                data.getMaxForProgressive()
                        ).findAll()
                )
        );

        System.out.println("_Leaved task 2_");
    }

    public TaskTwoController() {
    }
}
