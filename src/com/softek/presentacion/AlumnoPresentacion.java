package com.softek.presentacion;
import com.softek.modelo.Alumnos;

public class AlumnoPresentacion {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos("Alfredo", 4);
        double notasAl[] = {5, 6, 7, 8};
        alumno1.insertarCalificaciones(notasAl);
        System.out.println(alumno1.promedioCalificaciones());
        System.out.println(alumno1.getNombreAlumno());
        alumno1.mostrarCalificaciones();
    }
}