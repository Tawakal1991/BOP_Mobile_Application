package com.example.px_boc.Clinician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.Authentication.MainActivity;
import com.example.px_boc.R;

public class ShowPatients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_patients);
    }

    public void screenRegister (View view) {
        startActivity(new Intent(ShowPatients.this, MainActivity.class));
    }
    public void screenAddPatient (View view) {
        startActivity(new Intent(ShowPatients.this, AddPatients.class));
    }

}