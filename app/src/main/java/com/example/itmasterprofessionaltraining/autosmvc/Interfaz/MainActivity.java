package com.example.itmasterprofessionaltraining.autosmvc.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.itmasterprofessionaltraining.autosmvc.Listeners.ListenerBotonGuardar;
import com.example.itmasterprofessionaltraining.autosmvc.Listeners.ListenerBotonVer;
import com.example.itmasterprofessionaltraining.autosmvc.R;

public class MainActivity extends AppCompatActivity {
    private EditText eTextModelo, eTextMarca, eTextAnio, eTextKm;
    private Button buttonGuardar, buttonVer;
    private TextView tViewId;
    ListenerBotonGuardar listenerBotonGuardar;
    ListenerBotonVer listenerBotonVer;

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

    public void settViewId(TextView tViewId) {
        this.tViewId = tViewId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTextModelo =findViewById(R.id.eTextModelo);
        eTextMarca =findViewById(R.id.eTextAnio);
        eTextAnio =findViewById(R.id.eTextAnio);
        eTextKm =findViewById(R.id.eTextKm);
        tViewId = findViewById(R.id.tViewId);
        buttonGuardar = findViewById(R.id.buttonGuardar);
        buttonVer = findViewById(R.id.buttonVer);

        ListenerBotonGuardar = new ListenerBotonGuardar(this);
        ListenerBotonVer = new ListenerBotonVer(this);

        buttonGuardar.setOnClickListener(listenerBotonGuardar);
        buttonVer.setOnClickListener(listenerBotonVer);
    }
}
