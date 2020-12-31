package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",4,four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5",5,five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6",6,six.intValue());

        int y = Integer.valueOf("7");
        int x = Integer.parseInt("8");
        int z = x+y;
        System.out.println("x + y ="+z);
    }

    @Test
    public void convertAnIntToHex() {
        assertEquals("that 11 becomes b","b",Integer.toHexString(11));
        assertEquals("that 10 becomes a","a",Integer.toHexString(10));
        assertEquals("that 11 becomes 3","3",Integer.toHexString(3));
        assertEquals("that 11 becomes 15","15",Integer.toHexString(21));
    }
}
