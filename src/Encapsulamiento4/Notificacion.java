package Encapsulamiento4;

public class Notificacion {
    private String notificaciones;

    // Constructor para ingresar estado de notificacion
    public Notificacion(String notificaciones){
        this.notificaciones = notificaciones;
    }

    // Metodo get
    public String getNotificaciones() {
        return notificaciones;
    }

    // Metodo set para modificar notificacion
    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }

    // Metodo para validar estado de notificaciones
    public void validarNotificaciones() {
        if (notificaciones.toLowerCase().equals("si")) {
            System.out.println("Notificaciones activadas.");
        } else {
            System.out.println("Notificaciones desactivadas.");
        }
    }
}
