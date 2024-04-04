package com.softek.modelo;

public class Areas {

    public static double areaCirculoMet(){
        int radioCirculo;
        radioCirculo = 6;

        double areaCirculo;
        areaCirculo = Math.PI * (radioCirculo * radioCirculo);


        return areaCirculo;
    }
    public static int areaRectangulo(){
        int baseRectactungulo;
        baseRectactungulo = 6;
        int alturaRectangulo ;
        alturaRectangulo = 3;
        int areacRectanguloOp;
        areacRectanguloOp = baseRectactungulo * alturaRectangulo;
        return areacRectanguloOp;

    }


}
