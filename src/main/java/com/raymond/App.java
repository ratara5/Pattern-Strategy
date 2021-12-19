package com.raymond;

import com.raymond.strategy.AntivirusAvanzado;
import com.raymond.strategy.AntivirusSimple;
import com.raymond.strategy.Contexto;

public class App {

    public static void main(String[] args) {
        Contexto contexto=new Contexto(new AntivirusAvanzado());//o new Antivirus Simple
        contexto.ejecutar();
    }
}
