package Encapsulamiento4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String idioma, notificaciones;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------Validacion Idioma---------");
        System.out.println("Idiomas Soportados ");
        System.out.println("Español - Ingles - Frances");
        System.out.printf("Ingrese el idioma: ");
        idioma = scanner.next();
        Idioma valIdioma = new Idioma(idioma);
        System.out.println("Quiere activar notificaciones (Si/No): ");
        notificaciones = scanner.next();
        Notificacion notificacion = new Notificacion(notificaciones);

        valIdioma.validarIdioma();

        notificacion.validarNotificaciones();

        System.out.println("---------");
        valIdioma.setIdioma("Aleman");

        valIdioma.validarIdioma();

        notificacion.setNotificaciones("si");
        notificacion.validarNotificaciones();
    }
}