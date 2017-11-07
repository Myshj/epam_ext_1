package org.alexey.task_1.controllers;

import org.alexey.TaskController;
import org.alexey.task_1.convertors.LongConverter;
import org.alexey.task_1.data.ExampleData;

import java.util.Arrays;

public class TaskOneController extends TaskController {
    @Override
    public void doTask() {
        System.out.println("_Entered task 1_");
        ExampleData data = new ExampleData();

        System.out.print(data.getToBinaryValue() + " (to binary): ");
        System.out.println(
                Arrays.toString(
                        new LongConverter(
                                data.getToBinaryValue(),
                                (byte) 2
                        ).toCharArray()
                )
        );

        System.out.print(data.getToHexValue() + " (to hex): ");
        System.out.println(
                Arrays.toString(
                        new LongConverter(
                                data.getToHexValue(),
                                (byte) 16
                        ).toCharArray()
                )
        );

        System.out.print(data.getToOctaValue() + " (to octa): ");
        System.out.println(
                Arrays.toString(
                        new LongConverter(
                                data.getToOctaValue(),
                                (byte) 8
                        ).toCharArray()
                )
        );

        System.out.println("_Leaved task 1_");
    }

    public TaskOneController() {
    }
}
