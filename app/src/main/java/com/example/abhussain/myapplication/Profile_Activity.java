package com.example.abhussain.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile_Activity extends AppCompatActivity {
    EditText u1,u2;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        u1 = (EditText) findViewById(R.id.user1);
        u2 = (EditText) findViewById(R.id.pass1);
        b1 = (Button)findViewById(R.id.save);
        b2= (Button) findViewById(R.id.load);
        constant.mainArch = this;


    }
public void onclick(View v)
{
    if (v.getId() == R.id.save)
    {
        constant.save(u1.getText().toString(),u2.getText().toString());
        Toast.makeText(this, "Data Has Been Saved  " + u1.getText().toString()+u2.getText().toString(), Toast.LENGTH_LONG).show();
    }
    if (v.getId() == R.id.load)
    {
        String value = constant.load(u1.getText().toString(),null);
        Toast.makeText(this, "Loaded........." + value, Toast.LENGTH_LONG).show();
    }
}
}
