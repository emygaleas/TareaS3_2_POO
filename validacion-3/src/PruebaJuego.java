public class PruebaJuego {
    private int puntuacion;
    //COnstructor
    public PruebaJuego(){
        this.puntuacion = 5;
    }
    //Metodo para obtener la puntuacion
    public int getPuntuacion(){
        return puntuacion;
    }
    public boolean sumarPuntos(int puntos){
        if (puntos <=0){
            System.out.println("No se puede sumar numeros negativos");
            return false;
        }
        if (puntuacion + puntos > 5000){
            System.out.println("Puntaje invalido, excede el limite permitido");
            return false;
        }
        puntuacion += puntos;
        return true;
    }
}
