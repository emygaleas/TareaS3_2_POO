package Metodo7;

public class Producto {
    public static float precio;
    public static float descuento;

    // Constructor para ingresar datos
    public Producto(float precio, float descuento){
        this.precio = precio;
        this.descuento = descuento;
    }

    // Metodo float en el que devuelve el valor total y muestra informacion
    public static float calcularPrecioConDescuento(){
        descuento = precio * (descuento / 100);
        // Calcular total precio del producto
        float total = precio - descuento;
        // Mostrar informacion
        System.out.println("---------------------------------------");
        System.out.println("Precio original: "+ precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: "+ total);
        System.out.println("---------------------------------------");
        return total;
    }

}
