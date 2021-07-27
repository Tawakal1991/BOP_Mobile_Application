package com.example.px_boc.Authentication;

import android.content.Intent;
import android.os.Bundle;

import com.example.px_boc.R;
import com.example.px_boc.Clinician.ShowAllClinicians;
import com.example.px_boc.Clinician.ShowPatients;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void screenLogin (View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void screenPatients (View view) {
        startActivity(new Intent(MainActivity.this, ShowPatients.class));
    }

    public void screenClinicians (View view) {
        startActivity(new Intent(MainActivity.this, ShowAllClinicians.class));
    }

}