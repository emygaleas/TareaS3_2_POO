package encapsulamiento3;

public class Juego {
    public static void main(String[] args){
        PruebaJuego juego = new PruebaJuego();
        //Puntuacion inicial
        System.out.println("Puntuacion inicial es: "+juego.getPuntuacion());
        //Sumar puntos
        juego.sumarPuntos(35);
        System.out.println("Puntucion total: "+juego.getPuntuacion());

        //Intento con negativos
        juego.sumarPuntos(-63);
        System.out.println("Puntuacion con negativo: "+juego.getPuntuacion());
    }
}
