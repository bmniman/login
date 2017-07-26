package com.example.bmnim.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username,password,signup;
    Button btn;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.username);
        btn = (Button) findViewById(R.id.loginbtn);
        signup = (TextView) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(!checkEmpty())
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"WELCOME ", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


    }



    boolean checkEmpty()
    {

        boolean empty = false;
        if(username.getText().toString().equals("") || password.getText().toString().equals(""))
        {
            empty =  true;
            Toast toast = Toast.makeText(getApplicationContext(),"Fill UP ALL THE DETAILS ", Toast.LENGTH_SHORT);
            toast.show();
        }
        return empty;
    }
}
