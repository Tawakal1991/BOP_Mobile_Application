package com.example.px_boc.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.R;
import com.example.px_boc.Clinician.ShowPatients;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void screenRegister (View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void screenPatients (View view) {
        startActivity(new Intent(LoginActivity.this, ShowPatients.class));
    }
}