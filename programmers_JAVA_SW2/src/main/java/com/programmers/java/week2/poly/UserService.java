package com.programmers.java.week2.poly;

public class UserService implements Login{

    private Login login;

    public UserService(Login login){
        this.login = login;
    }

    @Override
    public void login() {
        login.login();
    }
}
