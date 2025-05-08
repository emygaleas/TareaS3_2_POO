package Encapsulamiento2;

public class Main_V {
    public static void main(String[] args) {
        Vehiculo_E miCoche = new Vehiculo_E();

        System.out.println("=== PRUEBA DE ENCAPSULAMIENTO ===");

        // Intentar acelerar (controlado por el método)
        miCoche.acelerar(80);
        miCoche.mostrarEstado();

        miCoche.acelerar(150); // Supera el límite
        miCoche.mostrarEstado();

        // Intentar frenar (controlado por el método)
        miCoche.frenar(100);
        miCoche.mostrarEstado();

        miCoche.frenar(200); // Intenta frenar más de lo posible
        miCoche.mostrarEstado();
        // miCoche.velocidad = 300; //  Esto daría error de compilación (privado)
        System.out.println("\n Velocidad obtenida por getter: " + miCoche.getVelocidad() + " km/h");
    }
}