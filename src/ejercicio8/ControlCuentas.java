package ejercicio8;
import java.util.Scanner;
//Validaciones: Ejercicio Bancos - Control de Cuentas
public class ControlCuentas {
    public static void main(String[] args) {
        //crear scanner que permite ingresar datos del teclado.
        Scanner sc = new Scanner(System.in);
        //pedir al usuario que ingrese un valor
        System.out.print("\nIngrese el monto a depositar: ");
        //ingresar el monto a depositar
        double deposito = sc.nextDouble();
        //crear un objeto cuenta
        Cuentas cuenta = new Cuentas(100);
        //se valida y se agrega el monto a la cuenta
        cuenta.validacionDeposito(deposito);

        System.out.print("\nIngrese el monto a retirar: ");
        //el usuario ingresa el monto a retirar
        double retiro = sc.nextDouble();
        //se llama al metodo si el monto es válido y se retira.
        cuenta.validacionRetiro(retiro);

        //verificar el saldo actual:
        cuenta.mostrarSaldo();

        sc.close();
    }
}
