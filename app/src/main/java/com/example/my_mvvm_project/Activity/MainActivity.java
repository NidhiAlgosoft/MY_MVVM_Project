package com.example.my_mvvm_project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.my_mvvm_project.R;

public class MainActivity extends AppCompatActivity {
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login_activity.class);
                startActivity(intent);

            }
        };handler.postDelayed(runnable,1000);


    }
}