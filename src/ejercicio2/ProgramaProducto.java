package ejercicio2;
import java.util.Scanner;

public class ProgramaProducto {
    public static void main(String[] args) {
        //crear objeto scanner que permita ingresar datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nIngrese el precio del producto: ");
        //pedir al usuario que ingrese el precio del producto
        double precio = sc.nextDouble();
        //crear objeto producto con el precio
        Producto p1 = new Producto(precio);

        System.out.printf("\nEl IVA del producto es: $" + p1.calcularIVA());//se llama al metodo para calcular el iva

        sc.close();
    }
}
