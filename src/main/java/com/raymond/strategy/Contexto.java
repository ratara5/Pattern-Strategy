package com.raymond.strategy;

public class Contexto {
    private IEstrategia estategia;

    public Contexto(IEstrategia estategia) {
        this.estategia = estategia;
    }

    public void ejecutar(){
        this.estategia.analizar();
    }
}
