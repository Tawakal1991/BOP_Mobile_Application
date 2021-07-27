package com.example.px_boc.Clinician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.Admin.AddClinician;
import com.example.px_boc.Authentication.MainActivity;
import com.example.px_boc.R;

public class ShowAllClinicians extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_clinicians);
    }

    public void screenRegister (View view) {
        startActivity(new Intent(ShowAllClinicians.this, MainActivity.class));
    }

    public void screenAddClinician (View view) {
        startActivity(new Intent(ShowAllClinicians.this, AddClinician.class));
    }


}