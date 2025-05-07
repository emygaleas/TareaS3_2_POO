package Validacion4;

public class Notificacion {
    public String notificaciones;

    // Constructor para ingresar estado de notificacion
    public Notificacion(String notificaciones){
        this.notificaciones = notificaciones;
    }

    // Metodo para validar estado de notificacion
    public void validarNotificaciones() {
        if (notificaciones.toLowerCase().equals("si")) {
            System.out.println("Notificaciones ahora están activadas.");
        } else {
            System.out.println("Notificaciones ahora están desactivadas.");
        }
    }
}
