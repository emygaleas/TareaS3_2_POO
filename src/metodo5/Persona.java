package metodo5;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean verificarEdad() {
        return edad >= 18;
    }
}
