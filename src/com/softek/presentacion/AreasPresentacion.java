package com.softek.presentacion;
import com.softek.modelo.Areas;
public class AreasPresentacion {
    public static void main(String[] args) {

        // area ciruclo
        double areaCirculoF = Areas.areaCirculoMet();
        System.out.println("Area Circulo : ");
        System.out.println(areaCirculoF);


        // area rectangulo
        System.out.println("Area Rectangulo :");
        int areaRectanguloVar = Areas.areaRectangulo();
        System.out.println(areaRectanguloVar);

    }


}
