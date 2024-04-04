package com.softek.modelo;

import java.util.Random;

public class Dados {
    private static Random numeroAleatorio = new Random();

    public Dados() {
    }

    public static String tirar() {
        int resultado = numeroAleatorio.nextInt(6) + 1;
        if (resultado == 1) {
            return numero1();
        } else if (resultado == 2) {
            return numero2();
        } else if (resultado == 3) {
            return numero3();
        } else if (resultado == 4) {
            return numero4();
        } else if (resultado == 5) {
            return numero5();
        } else if (resultado == 6) {
            return numero6();
        } else {
            return "Número inválido";
        }
    }

    public static String numero1() {
        return "*";
    }

    public static String numero2() {
        return "* *";
    }

    public static String numero3() {
        return "* * *";
    }

    public static String numero4() {
        return "* *\n* *";
    }

    public static String numero5() {
        return "* *\n* *\n* *";
    }

    public static String numero6() {
        return "* *\n* *\n* *\n* *\n* *";
    }
}
