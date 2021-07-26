package com.example.px_boc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddClinician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_clinician);
    }

    public void screenAddClinician (View view) {
        startActivity(new Intent(AddClinician.this, ShowAllClinicians.class));
    }
}