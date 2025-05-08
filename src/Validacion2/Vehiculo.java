package Validacion2;
public class Vehiculo {
    private int velocidad;
    private static final int VELOCIDAD_MAXIMA = 200;
    // Métodos para control de velocidad
    public void acelerar(int incremento) {
        if (incremento <= 0) {
            System.out.println("El incremento debe ser positivo");
            return;
        }
        if (velocidad + incremento > VELOCIDAD_MAXIMA) {
            System.out.println("¡Atención! No se puede superar la velocidad máxima de " + VELOCIDAD_MAXIMA + " km/h");
            velocidad = VELOCIDAD_MAXIMA;
        } else {
            velocidad += incremento;
        }
    }
    public void frenar(int decremento) {
        if (decremento <= 0) {
            System.out.println("El decremento debe ser positivo");
            return;
        }

        if (velocidad - decremento < 0) {
            System.out.println("¡Atención! La velocidad no puede ser negativa");
            velocidad = 0;
        } else {
            velocidad -= decremento;
        }
    }
    // Método para ver la velocidad actual
    public int getVelocidad() {
        return velocidad;
    }
}