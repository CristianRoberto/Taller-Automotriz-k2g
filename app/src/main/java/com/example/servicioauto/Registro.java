package com.example.servicioauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {



    Button registrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

      registrase =findViewById(R.id.Btn_registrar);
      registrase.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Registro.this,     Main2Activity.class);
              startActivity(intent);
          }
      });
    }
}
