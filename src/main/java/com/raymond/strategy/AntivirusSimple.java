package com.raymond.strategy;

import jdk.swing.interop.SwingInterOpUtils;

public class AntivirusSimple extends AnalisisSimple {


    @Override
    void iniciar() {
        System.out.println("Antivirus Simple - Análisis simple iniciado");
    }

    @Override
    void saltarZip() {
        try {
            System.out.println("Analizando");
            Thread.sleep(2500);
            System.out.println("Se omiten archivos zip");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void detener() {
        System.out.println("Antivirus Simple - Análisis simple finalizado");
    }
}
