package com.example.servicioauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView datos;
    TextView botonListaServicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        datos = (TextView) findViewById(R.id.button2Registrar);
        datos.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View view) {
            // se genera la navegabilidad entre la actividad principal y la actividad de login
            Intent intent = new Intent(Principal.this, Login.class);
            startActivity(intent);
        }
        });

        botonListaServicios= findViewById(R.id.botonListaServicios);
        botonListaServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, ServiciosArrealizar.class);
                startActivity(intent);
            }
        });

}
    }
