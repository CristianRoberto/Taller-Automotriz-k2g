package com.example.servicioauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ListaServicios extends AppCompatActivity {

    Button SecionServicios;

    ListView lista;
    String[][] datos = {

            {"Pintado Automotriz", "", "800$ ", " Se realiza si el cleinte lo desea"},
            {"Cambio de Aceite", "", "25$", "", "reparamos el chasi a nivel de los profesionales"},
            {"Cambio de Llantas", "", "30 $ Por unidad", "", " necesario para evitar posible fallos en su conduncion "},
            {" Cableado Electrico", "", "250$ General", "", "Paa por dos pilotos cuyas mentes están unid "},
            {" Otros(Cambio De bujia, revizion de aceite, Etc)", "250$ General", "", "Paa por dos pilotos cuyas mentes están unid "},
    };
    int[] datosImg = {R.drawable.pintadoautomotriz, R.drawable.cambioaceite, R.drawable.cambiollantas, R.drawable.cambiocableadoelectrico};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_servicios);



        setContentView(R.layout.activity_lista_servicios);

        lista = (ListView) findViewById(R.id.Lista);

        lista.setAdapter(new adaptador2(this, datos ,datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detalles = new Intent(view.getContext(), reserva.class);

                startActivity(detalles);
            }
        });
        fileList();
    }
}
