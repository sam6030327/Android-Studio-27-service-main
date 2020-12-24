package com.example.android_27_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button star, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star = (Button)findViewById(R.id.star);
        stop = (Button)findViewById(R.id.stop);

        star.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == star){
            startService(new Intent(this, MyService.class));
        }
        else if (v == stop){
            stopService(new Intent(this, MyService.class));
        }
    }
}