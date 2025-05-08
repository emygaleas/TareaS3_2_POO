package ejercicio2;
import java.util.Scanner;

public class ProgramaProducto {
    public static void main(String[] args) {
        //crear objeto scanner que permita ingresar datos por teclado
        Scanner sc = new Scanner(System.in);
        //crear objeto producto
        Producto p1 = new Producto();

        System.out.println("Ingrese el precio del producto: ");
        //pedir al usuario que ingrese el precio del producto
        double precio = sc.nextDouble();
        //se agrega el precio al producto (p1)
        p1.precio = precio;

        System.out.println("El IVA del producto es: $" + p1.calcularIVA());//se llama al metodo para calcular el iva

        sc.close();
    }
}
