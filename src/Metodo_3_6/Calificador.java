package Metodo_3_6;

public class Calificador {
    public static char categoriaDeCalificacion(double calificacion) {
        if (calificacion >= 90) {
            return 'A';
        } else if (calificacion >= 80) {
            return 'B';
        } else if (calificacion >= 70) {
            return 'C';
        } else if (calificacion >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

