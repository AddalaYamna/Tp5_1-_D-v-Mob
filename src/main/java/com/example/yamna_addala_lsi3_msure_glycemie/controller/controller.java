package com.example.yamna_addala_lsi3_msure_glycemie.controller;
import com.example.yamna_addala_lsi3_msure_glycemie.model.patient;
public final class controller {
    private static controller instance = null;
    private static patient patient;
    private controller()
    {
        super();
    }
    public void create_patient(int age ,float valeur , boolean isFasting){
        patient=new patient(age,valeur,isFasting) ;
    }
    //update entre le controller vers la view
    public String getResult(){

        return patient.getResultat();//update patient to controller
    }
    public static  controller getInstance() {
        if ( controller.instance == null)
            controller.instance = new controller();
        return instance;
}
}
