package com.example.px_boc.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.R;

public class AddMedication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medication_admin);
    }

    public void goBackButton(View view) {
        startActivity(new Intent(AddMedication.this, AdminActivity.class));
    }
}