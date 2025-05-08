package Encapsulamiento2;

public class Vehiculo_E {
    // Atributos PRIVADOS (encapsulados)
    private int velocidad;
    private final int VELOCIDAD_MAXIMA = 200;

    // Constructor (inicia velocidad en 0)
    public Vehiculo_E() {
        this.velocidad = 0;
    }

    // 🔹 MÉTODO CONTROLADO para acelerar (con validación)
        public void acelerar(int incremento) {
        if (incremento <= 0) {
            System.out.println("Error: El incremento debe ser positivo.");
            return;
        }

        int velocidadTemporal = velocidad + incremento;

        if (velocidadTemporal > VELOCIDAD_MAXIMA) {
            velocidad = VELOCIDAD_MAXIMA;
            System.out.println("¡Alerta! Velocidad máxima alcanzada (" + VELOCIDAD_MAXIMA + " km/h).");
        } else {
            velocidad = velocidadTemporal;
            System.out.println("Aceleraste a " + velocidad + " km/h.");
        }
    }

    // 🔹 MÉTODO CONTROLADO para frenar (con validación)
    public void frenar(int decremento) {
        if (decremento <= 0) {
            System.out.println("Error: El decremento debe ser positivo.");
            return;
        }

        int velocidadTemporal = velocidad - decremento;

        if (velocidadTemporal < 0) {
            velocidad = 0;
            System.out.println("El auto se detuvo (0 km/h).");
        } else {
            velocidad = velocidadTemporal;
            System.out.println("Frenaste a " + velocidad + " km/h.");
        }
    }

    // 🔹 GETTER (única forma de consultar la velocidad desde fuera)
    public int getVelocidad() {
        return velocidad;
    }

    // 🔹 MÉTODO PARA MOSTRAR ESTADO ACTUAL
    public void mostrarEstado() {
        System.out.println("\n[ESTADO ACTUAL]");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Límite máximo: " + VELOCIDAD_MAXIMA + " km/h");
    }
}