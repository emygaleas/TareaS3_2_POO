package metodo1;

public class Descuento {
    String producto;
    Double precio;
    int porcentaje;

    public Descuento(String producto, Double precio, int porcentaje){
        this.producto = producto;
        this.precio = precio;
        this.porcentaje = porcentaje;
    }
    public void calcularDescuento(){
        int descuento = (int) (precio*(porcentaje/100.0));
        System.out.println("Descuento aplicado: " + descuento);
    }


}
