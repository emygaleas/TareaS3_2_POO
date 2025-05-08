package Metodo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float precio, descuento;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese el precio del producto: ");
        precio = scanner.nextFloat();
        System.out.printf("Ingrese el porcentaje del descuento: ");
        descuento = scanner.nextFloat();

        // Se crea objeto para enviar datos a la clase
        Producto producto = new Producto(precio,descuento);

        // LLamar a clase para calculo e imprimir datos
        producto.calcularPrecioConDescuento();
    }
}
