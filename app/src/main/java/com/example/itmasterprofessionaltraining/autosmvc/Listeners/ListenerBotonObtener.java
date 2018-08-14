package com.example.itmasterprofessionaltraining.autosmvc.Listeners;


import android.view.View;
import android.widget.Toast;

import com.example.itmasterprofessionaltraining.autosmvc.Interfaz.MainActivity;
import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;

public class ListenerBotonObtener implements View.OnClickListener {
    private MainActivity context;

    public ListenerBotonObtener(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Integer id = Integer.valueOf(context.getEtId().getText().toString());
        if(id <  context.getControladorAuto().cantidadAuto()){
            if(context.getControladorAuto().cantidadAuto() != 0) {
                context.setUnAuto(context.getControladorAuto().getAuto(id));
                context.geteTextModelo().setText(context.getUnAuto().getModelo());
                context.geteTextMarca().setText(context.getUnAuto().getMarca());
                context.geteTextAnio().setText(context.getUnAuto().getAnio().toString());
                context.geteTextKm().setText(context.getUnAuto().getKm().toString());
            }else{
                Toast.makeText(context,"No hay personas",Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(context,"Fuera de rango",Toast.LENGTH_SHORT).show();
        }
    }
}
