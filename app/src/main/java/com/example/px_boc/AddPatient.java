package com.example.px_boc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddPatient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_patient);
    }

    public void screenPatients (View view) {
        startActivity(new Intent(AddPatient.this, ShowAllPatients.class));
    }

    public void screenAddAdmission (View view) {
        startActivity(new Intent(AddPatient.this, AddAdmission.class));
    }
}