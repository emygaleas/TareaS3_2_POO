import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Descuento[] descuento = new Descuento[3];
        String producto;
        double precio;
        int porcentaje;

        for(int i=0;i<3;i++) {
            System.out.println("-----DESCUENTOS----");
            System.out.println("Nombre del producto: ");
            producto = sc.nextLine();
            System.out.println("Precio: ");
            precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Porcentaje del descuento: ");
            porcentaje=sc.nextInt();
            sc.nextLine();

            descuento[i]= new Descuento(producto,precio,porcentaje);
        }
        for (int i=0; i<3;i++){
            System.out.println("Producto: " + descuento[i].producto);
            System.out.println("Precio: " + descuento[i].precio);
            System.out.println("Porcentaje: "+descuento[i].porcentaje);
            descuento[i].calcularDescuento();
            System.out.println();
        }
        sc.close();
    }
}