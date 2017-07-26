package com.example.bmnim.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    TextView username,password,confpassword;
    Button signup;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        confpassword = (TextView) findViewById(R.id.confpassword);
        signup = (Button) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(!isEmpty())
                {
                    isValid();
                }
            }
        });


    }

    boolean isEmpty()
    {
        boolean empty = false;

        if(username.getText().toString().equals("") || password.getText().toString().equals("") || confpassword.getText().toString().equals(""))
        {
            empty =  true;
            Toast toast = Toast.makeText(getApplicationContext(),"FILL UP THE DETAILS", Toast.LENGTH_SHORT);
            toast.show();
        }

        return empty;
    }

    boolean isValid()
    {
        boolean valid = true;

        if(!password.getText().toString().equals( confpassword.getText().toString()) )
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Password Mismatch", Toast.LENGTH_SHORT);
            toast.show();
           valid = false;
        }


        return valid;
    }
}
