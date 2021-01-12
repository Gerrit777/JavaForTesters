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

    // Exercise page 121 (chapter 8)
    @Test
    public void nestedIfElseHrorror(){
        boolean truthy=true;
        boolean falsy=true;
        if (truthy)
        {
            if (!falsy)
                if (falsy|truthy)
                {
                    assertTrue(truthy);
                    assertFalse(falsy);
                }
            else
                {
                    assertTrue(truthy);
                    assertTrue(falsy);
                }
        }
        else{
            if (!truthy)
                    if (falsy)
                    {
                        assertTrue(falsy);
                        assertFalse(truthy);
                    }
            else {
                        assertFalse(falsy);
                        assertFalse(truthy);
            }
        }

    }
    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }
    public String likelyGenderIs(String title){
        String likelyGender;
        switch(title.toLowerCase()){
            case "sir":
            likelyGender = "M";
            break;
            case "mr":
            likelyGender = "M";
            break;
            case "master":
            likelyGender = "M";
            break;

            default:
            likelyGender = "F";
            break; }
        return likelyGender; }


    @Test
    public void switchExample2(){
        assertEquals("United Kingdom", countryIs("UK"));
        assertEquals("United States", countryIs("US"));
        assertEquals("United States", countryIs("USA"));
        assertEquals("France", countryIs("FR"));
        assertEquals("Sweden", countryIs("SE"));
        assertEquals("Rest of the world", countryIs("NL"));

    }
    public String countryIs(String title){
        String countryIs;
        switch(title.toLowerCase()){
            case "uk":
                countryIs = "United Kingdom";
                break;
            case "us":
            case "usa":
                countryIs = "United States";
                break;
            case "fr":
                countryIs = "France";
                break;
            case "se":
                countryIs = "Sweden";
                break;

            default:
                countryIs = "Rest of the world";
                break; }
        return countryIs; }

}




