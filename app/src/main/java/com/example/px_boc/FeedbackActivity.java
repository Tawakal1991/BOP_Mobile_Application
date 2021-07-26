package com.example.px_boc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


    }

    public void addfeedBack (View view) {
        startActivity(new Intent(FeedbackActivity.this, MainActivity.class));
    }

    public void Back(View view) {
        startActivity(new Intent(FeedbackActivity.this, MainActivity.class));
    }

}