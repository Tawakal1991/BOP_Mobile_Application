package com.example.px_boc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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