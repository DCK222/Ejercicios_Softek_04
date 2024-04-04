package com.softek.modelo;

public class Alumnos {
    private String nombreAlumno;
    private double[] calificacionesAlumno;

    public Alumnos(String nombreAlumno, int cantidadCalificaciones) {
        this.nombreAlumno = nombreAlumno;
        this.calificacionesAlumno = new double[cantidadCalificaciones];
    }

    public void insertarCalificaciones(double[] notasExamenes) {
        for (int i = 0; i < notasExamenes.length; i++) {
            this.calificacionesAlumno[i] = notasExamenes[i];
        }
    }

    public String getNombreAlumno() {
        System.out.println("Nombre Alumno : ");
        return nombreAlumno;
    }

    public double promedioCalificaciones() {
        double suma = 0;
        for (int i = 0; i < this.calificacionesAlumno.length; i++) {
            suma += this.calificacionesAlumno[i];
        }
        System.out.println("La media es : ");
        return suma / this.calificacionesAlumno.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("calificaciones del alumno : ");
        for (int i = 0; i < calificacionesAlumno.length; i++) {
            System.out.println(calificacionesAlumno[i]);
        }
    }

}
