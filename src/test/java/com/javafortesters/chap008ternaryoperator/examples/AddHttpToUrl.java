package com.javafortesters.chap008ternaryoperator.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddHttpToUrl {
    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url) {
        return "http://"+url;
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }else{
            if(!url.startsWith("www")){
            url = "www." + url;
        }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    // Exercise page 117 (chapter 8)
    @Test
        public void assertIfTruePart1(){
        boolean truthy=true;
        if (truthy)
                assertTrue(truthy);
    }
    @Test
    public void assertIfTruePart2(){
        boolean truthy=true;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }
    @Test
    public void assertIfTruePart3(){
        boolean truthy=true;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
        else
            assertFalse(truthy);
        }
    }



