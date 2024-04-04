package com.softek.modelo;

public class TablasMultiplicar {
    int x;
    public TablasMultiplicar(int i){
        this.x = i;
    }
    public void OperacionTabla(){
        System.out.println("Tabla del " + x);
        for (int i = 0; i <=10; i++){
            System.out.println(x + "x" + i + " = " + (x * i));
        }

    }


}
