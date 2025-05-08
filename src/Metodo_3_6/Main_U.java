package Metodo_3_6;

public class Main_U {
    public static void main(String[] args) {
        // Ejemplo de uso del método saludarUsuario
        String nombreUsuario = "Eduardo";
        String saludo = Usuario.saludar(nombreUsuario);
        // Mostrar el saludo personalizado en la consola
        System.out.println(saludo);
        // Otro ejemplo con diferente nombre
        System.out.println(Usuario.saludar("Juan"));
    }
}

