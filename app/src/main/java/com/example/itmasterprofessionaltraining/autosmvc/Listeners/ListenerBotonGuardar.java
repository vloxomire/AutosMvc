package com.example.itmasterprofessionaltraining.autosmvc.Listeners;

import android.view.View;
import android.widget.Toast;

import com.example.itmasterprofessionaltraining.autosmvc.Interfaz.MainActivity;
import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;

public class ListenerBotonGuardar implements View.OnClickListener{
    MainActivity context;


    public ListenerBotonGuardar(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        context.setUnAuto(new Auto());
        context.getUnAuto().setModelo(context.geteTextModelo().getText().toString());
        context.getUnAuto().setMarca(context.geteTextMarca().getText().toString());
        context.getUnAuto().setAnio(Integer.valueOf(context.geteTextAnio().getText().toString()));
        context.getUnAuto().setKm(Integer.valueOf(context.geteTextKm().getText().toString()));

        context.getControladorAuto().guardarAuto(context.getUnAuto());
        Toast.makeText(context, "GUARDADO " + toString().valueOf(context.getControladorAuto().cantidadAuto()),Toast.LENGTH_SHORT).show();
    }
}
