package com.javafortesters.chap009arrays.examples;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortWorkingdaysArray {

    @Test
    public void sortWorkdaysArrayAndAssertResult() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Monday");
        assertEquals(workdays[2], "Thursday");
        assertEquals(workdays[3], "Tuesday");
        assertEquals(workdays[4], "Wednesday");

        for (String aworkday : workdays) {
            System.out.println(aworkday);
        }

    }

    @Test
    public void sortWorkdaysMixedCaseArrayAndAssertResult() {
        String[] workdays = {"monday", "Tuesday", "Wednesday",
                "thursday", "Friday"};

        //Sort is on Capitals and after that Non-Capitals!!
        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Tuesday");
        assertEquals(workdays[2], "Wednesday");
        assertEquals(workdays[3], "monday");
        assertEquals(workdays[4], "thursday");

        for (String aworkday : workdays) {
            System.out.println(aworkday);
        }
    }
}
