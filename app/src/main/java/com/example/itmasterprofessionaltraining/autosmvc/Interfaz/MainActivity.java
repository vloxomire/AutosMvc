package com.example.itmasterprofessionaltraining.autosmvc.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.itmasterprofessionaltraining.autosmvc.Controllers.ControladorAuto;
import com.example.itmasterprofessionaltraining.autosmvc.Listeners.ListenerBotonGuardar;
import com.example.itmasterprofessionaltraining.autosmvc.Listeners.ListenerBotonObtener;
import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;
import com.example.itmasterprofessionaltraining.autosmvc.R;

public class MainActivity extends AppCompatActivity {
    private EditText eTextModelo, eTextMarca, eTextAnio, eTextKm, etId;
    private Button buttonGuardar, buttonObtener;
    ListenerBotonGuardar listenerBotonGuardar;
    ListenerBotonObtener listenerBotonObtener;
    private Auto unAuto;
    private ControladorAuto controladorAuto = new ControladorAuto();


    public Button getButtonObtener() {
        return buttonObtener;
    }

    public EditText getEtId() {
        return etId;
    }

    public void setEtId(EditText etId) {
        this.etId = etId;
    }

    public ControladorAuto getControladorAuto() {
        return controladorAuto;
    }

    public Auto getUnAuto() {
        return unAuto;
    }

    public void setUnAuto(Auto unAuto) {
        this.unAuto = unAuto;
    }

    public EditText geteTextModelo() {
        return eTextModelo;
    }

    public void seteTextModelo(EditText eTextModelo) {
        this.eTextModelo = eTextModelo;
    }

    public EditText geteTextMarca() {
        return eTextMarca;
    }

    public void seteTextMarca(EditText eTextMarca) {
        this.eTextMarca = eTextMarca;
    }

    public EditText geteTextAnio() {
        return eTextAnio;
    }

    public void seteTextAnio(EditText eTextAnio) {
        this.eTextAnio = eTextAnio;
    }

    public EditText geteTextKm() {
        return eTextKm;
    }

    public void seteTextKm(EditText eTextKm) {
        this.eTextKm = eTextKm;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTextModelo =findViewById(R.id.eTextModelo);
        eTextMarca =findViewById(R.id.eTextMarca);
        eTextAnio =findViewById(R.id.eTextAnio);
        eTextKm =findViewById(R.id.eTextKm);
        etId = findViewById(R.id.etId);
        buttonGuardar = findViewById(R.id.buttonGuardar);
        buttonObtener = findViewById(R.id.buttonObtener);

        listenerBotonGuardar = new ListenerBotonGuardar(this);
        listenerBotonObtener = new ListenerBotonObtener(this);

        buttonGuardar.setOnClickListener(listenerBotonGuardar);
        buttonObtener.setOnClickListener(listenerBotonObtener);
    }
}
