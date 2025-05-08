package encapsulamiento1;
import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {
        //crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        //crear cuenta
        Cuenta cuenta1 = new Cuenta();

        //al encapsular 'saldo' no es posible realizar la operación: cuenta1.saldo=100;

        System.out.print("\nIngrese el monto a depositar: ");
        //ingresar el monto a depositar
        double deposito = sc.nextDouble();
        cuenta1.depositar(deposito); //se agrega el monto a la cuenta

        System.out.print("\nIngrese el monto a retirar: ");
        //el usuario ingresa el monto a retirar
        double retiro = sc.nextDouble();
        //se llama al metodo, si el monto es válido se retira.
        cuenta1.retirar(retiro);

        //probar si los metodos depositar y retirar funcionan
        System.out.println("\nSaldo actual: $S" + cuenta1.getSaldo());

    }
}
