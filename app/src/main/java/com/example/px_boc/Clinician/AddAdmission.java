package com.example.px_boc.Clinician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.R;

public class AddAdmission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_admission);
    }

    public void screenAddAdmission (View view) {
        startActivity(new Intent(AddAdmission.this, ShowAdmissions.class));
    }
}