package com.example.px_boc.Clinician;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.px_boc.R;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
    }

    public void screenPatients (View view) {
        startActivity(new Intent(GraphActivity.this, ShowPatients.class));
    }

    public void screenMedication (View view) {
        startActivity(new Intent(GraphActivity.this, AddMedicationToPatient.class));
    }

    public void feedbackPage (View view) {
        startActivity(new Intent(GraphActivity.this, FeedbackActivity.class));
    }
}