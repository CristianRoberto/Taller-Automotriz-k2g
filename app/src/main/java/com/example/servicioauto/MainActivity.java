package com.example.servicioauto;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private final int DURANTION_SPLAIN=1850;
    static int TIMEOUT_MILLIS = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new  Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, Principal.class);
                startActivity(intent);
                finish();
            }
        },DURANTION_SPLAIN);
    }
}
