package com.example.itmasterprofessionaltraining.autosmvc.Dao;

import com.example.itmasterprofessionaltraining.autosmvc.Models.Auto;

import java.util.ArrayList;

public class DaoAuto {
    ArrayList<Auto> autoArrayList = new ArrayList<>();

    public void addAuto(Auto unAuto){
        autoArrayList.add(unAuto);
    }
    public Integer getSizeArrayAuto(){
        return autoArrayList.size();
    }
    public Auto getAuto(Integer i){
        return autoArrayList.get(i);
    }
}
