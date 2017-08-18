package com.example.macstudent.catalog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by macstudent on 2017-08-04.
 */

public class login extends Activity {
    LoginDataBaseAdapter loginDataBaseAdapter;
    Button b1,b2;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();


         username = (EditText) findViewById(R.id.euname);
         password = (EditText) findViewById(R.id.epass);


        b2 = (Button) findViewById(R.id.register);
        b1 = (Button) findViewById(R.id.login);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String uname  = username.getText().toString();
             String  pass  = password.getText().toString();

                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(uname);

                if(pass.equals(storedPassword))
                {
                    Toast.makeText(getApplicationContext(), "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),CatalogActivity.class) ;
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "User Name or Password does not match", Toast.LENGTH_LONG).show();
                }
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),register.class) ;
                startActivity(i);

            }
        });

    }}
