package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected","username",user.getUsername());

        assertEquals("default password expected","password",user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){

        User user = new User("admin", "pA55w0rD");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("setter password expected",
                "PaZZwor6",
                user.getPassword());
    }

    @Test
    public void createAnArrayOfUsers(){
        User[] users = new User[3];

        users[0] = new User("bob","bA55Word");
        users[1] = new User("eris","eA55Word");
        users[2] = new User("ken","kA55Word");

        //Iterate over the array of users (chapter 9)
        for (User aUser:users){
            System.out.println(aUser.getUsername());
        }

        assertEquals("bob", users[0].getUsername());
        assertEquals("eris", users[1].getUsername());
        assertEquals("ken", users[2].getUsername());
    }
}
