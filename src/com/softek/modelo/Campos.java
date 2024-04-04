package com.softek.modelo;

public class Campos {
    private int x;
    public Campos(int i) {
        this.x = i;
    }
    public int Muestra(){
        return x;
    }
    public void Incrementa(){
        x++;
    }

    public Campos() {
    }
}
