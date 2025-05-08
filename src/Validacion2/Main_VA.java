package Validacion2;
public class Main_VA {
    public static void main (String[] args) {
        Vehiculo miAuto = new Vehiculo();

        // Prueba de aceleración
        System.out.println("\n--- Pruebas de aceleración ---");
        miAuto.acelerar(80);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        miAuto.acelerar(150);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        // Intento de superar velocidad máxima
        miAuto.acelerar(100);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        // Prueba de frenado
        System.out.println("\n--- Pruebas de frenado ---");
        miAuto.frenar(100);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        miAuto.frenar(150);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        // Intento de frenar más de lo posible
        miAuto.frenar(50);
        System.out.println("Velocidad actual: " + miAuto.getVelocidad() + " km/h");
        // Prueba con valores inválidos
        System.out.println("\n--- Pruebas con valores inválidos ---");
        miAuto.acelerar(-20);
        miAuto.frenar(-10);
    }
}
