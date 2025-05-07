package Encapsulamiento4;

public class Idioma {
    private String idioma;

    // Constructor para ingresar idioma
    public Idioma(String idioma){
        this.idioma = idioma;
    }

    // Metodo get
    public String getIdioma() {
        return idioma;
    }

    // Metodo set para modificar idioma
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    // Metodo para validar idioma
    public void validarIdioma() {
        if (this.idioma.toLowerCase().equals("español") || this.idioma.toLowerCase().equals("ingles")
                || this.idioma.toLowerCase().equals("frances")) {
            System.out.println("Idioma " + this.idioma + " es valido.");
        } else {
            System.out.println("Idioma " + this.idioma + " no es valido.");
        }
    }
}