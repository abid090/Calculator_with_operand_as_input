package com.example.abhussain.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class constant
{
    public static Context mainArch;
    // MY_PREFS_NAME - a static String variable like:
    public static final String MY_PREFS_NAME = "MyPrefsFile";
    public static void save (String a, String b)
    {

        SharedPreferences.Editor editor = mainArch.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString(a,b);
       // editor.putInt("idName", 12);
        editor.apply();


    }
    public static String load (String a, String b)
    {
        SharedPreferences prefs = mainArch.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString(a, null);
        String value = " ";
        if (restoredText != null)
        {
            value = prefs.getString(a, "No name defined");//"No name defined" is the default value.
           // int idName = prefs.getInt("idName", 0); //0 is the default value.
            return value;
        }
        return value;



    }
}
