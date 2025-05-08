package Validacion4;

public class Idioma {
    public String idioma;

    // Constructor para ingresar idioma
    public Idioma(String idioma){
        this.idioma = idioma;
    }

    // Metodo para validar idioma
    public void validarIdioma() {
        if (idioma.toLowerCase().equals("español") || idioma.toLowerCase().equals("ingles")
                || idioma.toLowerCase().equals("frances")) {
            System.out.println("Idioma " + idioma + " es valido.");
        } else {
            System.out.println("Idioma " + idioma + " no es valido.");
        }
    }
}
