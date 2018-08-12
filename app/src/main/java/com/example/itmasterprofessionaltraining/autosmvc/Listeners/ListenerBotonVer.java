package com.example.itmasterprofessionaltraining.autosmvc.Listeners;


import android.view.View;

import com.example.itmasterprofessionaltraining.autosmvc.Interfaz.MainActivity;
import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;

public class ListenerBotonVer implements View.OnClickListener {
    private MainActivity context;

    public ListenerBotonVer(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
    context.geteTextModelo().setText(context.getUnAuto().getModelo());
    context.geteTextMarca().setText(context.getUnAuto().getMarca());
    context.geteTextAnio().setText(context.getUnAuto().getAnio());
    context.geteTextKm().setText(context.getUnAuto().getKm());


    }
}
