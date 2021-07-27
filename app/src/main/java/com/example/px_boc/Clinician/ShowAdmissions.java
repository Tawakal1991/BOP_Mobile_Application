package com.example.px_boc.Clinician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.R;

public class ShowAdmissions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_admissions);
    }

    public void screenRegister (View view) {
        startActivity(new Intent(ShowAdmissions.this, ShowAllClinicians.class));
    }

    public void screenAddAdmission (View view) {
        startActivity(new Intent(ShowAdmissions.this, AddAdmission.class));
    }
}