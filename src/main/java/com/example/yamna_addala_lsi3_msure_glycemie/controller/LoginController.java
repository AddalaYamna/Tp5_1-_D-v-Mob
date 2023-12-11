package com.example.yamna_addala_lsi3_msure_glycemie.controller;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.yamna_addala_lsi3_msure_glycemie.model.User;

public class LoginController {
    private static final String SHERED_PREFS ="sharedPreferences" ;
    private static User user;
    private static LoginController instance = null;
    private  LoginController()
    {
        super();
    }
    public static final LoginController getInstance(Context context)
    {
        if (LoginController.instance == null)
            instance = new  LoginController();
        recapUser(context);
        return  LoginController.instance;

    }
    public static void  recapUser(Context context)
    {
    SharedPreferences sharedPreferences = context.getSharedPreferences(SHERED_PREFS,context.MODE_PRIVATE);
    String userName = sharedPreferences.getString("userName","");
    String password = sharedPreferences.getString("password","");
    user = new User( userName,password);
    }
    public void createUser (String userName,String password, Context context){
        user = new User( userName,password);
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHERED_PREFS,context.MODE_PRIVATE);
        SharedPreferences.Editor editor  = sharedPreferences.edit();
        editor.putString("userName",userName);
        editor.putString("password0",password);
        editor.apply();
    }
    public String getUserName() {
        return user.getUserName();
    }

    public String getPassword() {
        return user.getPassword();
    }
}

