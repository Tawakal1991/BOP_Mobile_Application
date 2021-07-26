package com.example.px_boc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShowAllPatients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_patients);
    }

    public void screenRegister (View view) {
        startActivity(new Intent(ShowAllPatients.this, MainActivity.class));
    }
    public void screenAddPatient (View view) {
        startActivity(new Intent(ShowAllPatients.this, AddPatient.class));
    }

}