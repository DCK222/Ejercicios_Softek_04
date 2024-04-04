package com.softek.presentacion;

import com.softek.modelo.Dados;

import java.util.Scanner;

public class DadosPresentacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seguir = "s";

        do {
            System.out.println(Dados.tirar());

            System.out.println("Quieres seguir ? (s/n)");
            seguir = sc.nextLine();

        } while (!seguir.equals("n"));
    }
}