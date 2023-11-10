package com.example.pr20;

public class User {
    public String username;
    public String email;
    public String Male;
    public String SName;
    public Double Height;
    public Integer age;

    public User() {
// Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public User(String username, String email, Integer age, String SName, String Male, Double Height ) {
        this.username = username;
        this.email = email;
        this.Male = Male;
        this.age = age;
        this.SName= SName;
        this.Height= Height;
    }

}
