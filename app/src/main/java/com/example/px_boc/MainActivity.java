package com.example.px_boc;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

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
        startActivity(new Intent(MainActivity.this, ShowAllPatients.class));
    }

    public void screenClinicians (View view) {
        startActivity(new Intent(MainActivity.this, ShowAllClinicians.class));
    }

}