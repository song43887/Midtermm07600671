package com.example.midtermm07600671.Model;

public class Auth {
    private static  final String EMAIL = "bbb";
    private static  final String PASSWORD = "222";
    private String nEmail;
    private String nPass;

    public Auth(String nEmail,String nPass){
        this.nEmail=nEmail;
        this.nPass=nPass;
    }



    public boolean check(){
        if (nEmail.equals(EMAIL)&&nPass.equals(PASSWORD)){
            return true;
        }
        else {
            return false;
        }
    }
}
