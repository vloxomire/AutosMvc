package com.example.itmasterprofessionaltraining.autosmvc.Controllers;

import android.widget.TextView;

import com.example.itmasterprofessionaltraining.autosmvc.Dao.DaoAuto;
import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;

public class ControladorAuto {

    DaoAuto daoAuto = new DaoAuto();

    public void guardarAuto(Auto datoAuto){
        daoAuto.addAuto(datoAuto);
    }
    public TextView cantidadAuto(){
        return daoAuto.getSizeArrayAuto();
    }
    public Auto getAuto(Integer i){
        return daoAuto.getAuto(i);
    }
}

