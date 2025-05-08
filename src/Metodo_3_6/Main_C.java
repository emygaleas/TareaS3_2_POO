package Metodo_3_6;

public class Main_C {
    public static void main(String[] args) {
        // Pruebas del método categoriaDeCalificacion
        System.out.println("=== CONVERSIÓN DE CALIFICACIONES ===");
        double[] calificaciones = {95.5, 87.0, 73.2, 62.8, 58.0, 105.0, -10.5};
        for (double nota : calificaciones) {
            char categoria = Calificador.categoriaDeCalificacion(nota);
            System.out.printf("Calificación: %.1f -> Categoría: %c%n", nota, categoria);
        }
        System.out.println("\n--- Ejemplo con entrada específica ---");
        double miCalificacion = 88.3;
        char miCategoria = Calificador.categoriaDeCalificacion(miCalificacion);
        System.out.println("Para la calificación " + miCalificacion + " obtienes: " + miCategoria);
    }
}

