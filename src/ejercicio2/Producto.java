package ejercicio2;

public class Producto {
    //crear atributo precio para el producto
    double precio;
    //metodo constructor
    public Producto(double precio) {
        this.precio = precio;
    }
    //metodo para calcular el iva del producto
    public double calcularIVA(){
        return precio * 0.21;
    }
}
