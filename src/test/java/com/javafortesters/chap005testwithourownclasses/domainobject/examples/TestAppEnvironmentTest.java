package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import static com.javafortesters.domainobject.TestAppEnv.*;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL","http://192.123.0.3:67","http://"+DOMAIN+":"+PORT);
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain","192.123.0.3",DOMAIN);
        assertEquals("Just the port","67",PORT);
    }
}
