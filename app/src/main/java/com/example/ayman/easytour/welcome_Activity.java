package com.example.ayman.easytour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class welcome_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome_);
    }
}
