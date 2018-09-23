package com.example.abhussain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.*;

public class MainActivity extends AppCompatActivity {
    EditText a,b,opr1,vid,vpass;
    Button bt1;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        // get Intent By abid
        Intent intabid = getIntent();
        String id = intabid.getStringExtra("id");
        String pass = intabid.getStringExtra("pass");

        a = (EditText) findViewById(R.id.input1);
        b = (EditText) findViewById(R.id.input2);

        vid = (EditText) findViewById(R.id.showid) ;
        vpass = (EditText) findViewById(R.id.showpass) ;
        vid.setText(id);
        vpass.setText(pass);

        opr1 = (EditText) findViewById(R.id.operator);
        bt1 = (Button) findViewById(R.id.equal_sign);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void addition (View view)
    {    int c = Integer.valueOf(a.getText().toString())+Integer.valueOf(b.getText().toString());
       EditText re = (EditText) findViewById(R.id.result1);
        re.setText(String.valueOf(c));
    }
    //public void subtraction (View view)
    //{    int c = Integer.valueOf(a.getText().toString())-Integer.valueOf(b.getText().toString());
      //  EditText re = (EditText) findViewById(R.id.result1);
      // re.setText(String.valueOf(c));
    //}
    //public void multiplication (View view)
    //{    int c = Integer.valueOf(a.getText().toString())*Integer.valueOf(b.getText().toString());
      // EditText re = (EditText) findViewById(R.id.result1);
      //re.setText(String.valueOf(c));
    //}
    //public void division (View view)
    //{    int c = Integer.valueOf(a.getText().toString())/Integer.valueOf(b.getText().toString());
      // EditText re = (EditText) findViewById(R.id.result1);
       // re.setText(String.valueOf(c));
    //}

    public void calculate (View view)
    {
        String check_operator = String.valueOf(opr1.getText().toString());
        int a1 = Integer.valueOf(a.getText().toString());
        int b1 = Integer.valueOf(b.getText().toString());
        int r1 =0;
        switch (check_operator)
        {
            case "+":
                r1=a1+b1;

                break;
            case "-":

               r1=a1-b1;
                break;
            case "*":

               r1=a1*b1;
                break;
            case "/":
                r1=a1/b1;
                break;

            default:
                Toast.makeText(this, "invalid Operator", Toast.LENGTH_LONG).show();
                ///throw new IllegalArgumentException("Invalid Operator: " + check_operator);
                break;
        }
        EditText re = (EditText) findViewById(R.id.result1);
        re.setText(String.valueOf(r1));

        }
}
