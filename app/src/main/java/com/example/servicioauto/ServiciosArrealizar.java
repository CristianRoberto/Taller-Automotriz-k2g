package com.example.servicioauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ServiciosArrealizar extends AppCompatActivity {
    Button IniciarSecionServicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_arrealizar);


        IniciarSecionServicios = (Button) findViewById(R.id.IniciarSecionServicios);
        IniciarSecionServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiciosArrealizar.this, Login.class);
                startActivity(intent);
            }
        });

    }
    }
