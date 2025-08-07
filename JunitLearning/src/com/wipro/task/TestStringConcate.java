package com.wipro.task;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcate {

    @Test
    public void testDoStringConcat() {
        DailyTasks task = new DailyTasks();
        String result = task.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}