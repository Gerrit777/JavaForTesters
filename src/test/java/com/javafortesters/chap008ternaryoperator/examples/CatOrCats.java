package com.javafortesters.chap008ternaryoperator.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatOrCats {
    @Test
    public void ReturnNumberOfCats(){
        assertEquals ("1 == cat","cat",catOrCats(1));
        assertEquals ("0 == cats","cats",catOrCats(0));
        assertEquals ("2 == cats","cats",catOrCats(2));
    }
    private String catOrCats(int numberOfCats){
        return (numberOfCats==1)?"cat":"cats";
    }
}
