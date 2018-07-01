package com.example.android.mymusic;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signin=(Button) findViewById(R.id.email_sign_in_button);
        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String  email;
                ArrayList<String> store=new ArrayList<String>();
                String password;
                EditText emailreg;
                EditText passwordreg;

                //veriables


                // Set up the login form.
                emailreg=(EditText) findViewById(R.id.email);
                email=emailreg.getText().toString().trim();
                passwordreg=(EditText) findViewById(R.id.password);
                password=passwordreg.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                Toast.makeText(getApplicationContext(),email,Toast.LENGTH_SHORT).show();
                if (email.matches(emailPattern)){
                    store.add(email);
                    store.add(password);
                    Intent i=new Intent(LoginActivity.this,Payment.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address Please enter again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}

