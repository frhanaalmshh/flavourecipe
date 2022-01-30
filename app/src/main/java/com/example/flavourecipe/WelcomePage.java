package com.example.flavourecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class WelcomePage extends AppCompatActivity {

//welcome page that links to SignUpActivity and MainActivity java class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_page);
    }

    public void signup(View view) {
        startActivity(new Intent(WelcomePage.this,SignUpActivity.class));
    }

    public void login(View view) {
        startActivity(new Intent(WelcomePage.this,MainActivity.class));
    }
}