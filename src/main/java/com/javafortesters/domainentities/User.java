package com.javafortesters.domainentities;

public class User {
    private String username;
    private String password;

    public User() {
        this("username","password");
    }

    public User(String username, String password) {
        this.username = username; // Zonder quotes !! Anders werkt de test canConstructWithUsernameAndPassword niet !!
        this.password = password; // Zonder quotes !! Anders werkt de test canConstructWithUsernameAndPassword niet !!
    }

    public String getUsername() {
        return username;
    }
    public String getPassword(){

        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }
}
