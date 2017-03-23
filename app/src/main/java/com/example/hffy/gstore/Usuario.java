package com.example.hffy.gstore;

/**
 * Created by Sergio on 19/3/2017.
 */

public class Usuario extends Object{

    private String User_Name;
    private String Pass;
    private String Email;
    private String Celular;


    public Usuario(String []usuario) {
        this.User_Name = usuario[0];
        this.Pass = usuario[1];
        this.Email=usuario[2];
        this.Celular = usuario[3];

    }
    public String getUser_Name(){
        return User_Name;
    }

    public  String getPass(){
        return Pass;

    }
    public String getEmail(){
        return Email;

    }
    public  String getCelular(){
        return Celular;
    }
}
