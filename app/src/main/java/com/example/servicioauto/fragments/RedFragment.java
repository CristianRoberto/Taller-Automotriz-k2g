package com.example.servicioauto.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.servicioauto.MainActivity;
import com.example.servicioauto.R;


public class RedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_red, container, false);
        Button alquilar= v.findViewById(R.id.btnAlquila);
        alquilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se genera la navegabilidad entre la actividad principal y la actividad de login
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);


            }
        });
        return  v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
