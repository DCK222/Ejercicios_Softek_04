package com.softek.presentacion;

import com.softek.modelo.Campos;

public class CamposPresentacion {

    public static void main(String[] args) {
    Campos campo1 = new Campos(6);
    campo1.Incrementa();
    System.out.println(campo1.Muestra());

    }

}
