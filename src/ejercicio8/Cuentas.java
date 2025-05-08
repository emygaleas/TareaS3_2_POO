package ejercicio8;

public class Cuentas {
    //se crea el atributo saldo para la cuenta
    double saldo;
    public void mostrarSaldo(){
        System.out.println("\nEl saldo actual es: $" + saldo);
    }
    //metodo para validar el monto del deposito
    public void validacionDeposito(double monto){
        //si el monto es positivo, se deposita
        if (monto > 0 ){
            this.saldo += monto;
            System.out.println("Valor de: $" + monto + " Depositado correctamente.");
        }else System.out.println("Ingrese un valor válido.");
    }

    //metodo para validar el monto del retiro
    public void validacionRetiro(double monto){
        //si el monto es mayor a cero y menor al saldo disponible, se retira
        if (monto > 0 && monto < saldo ){
            this.saldo -= monto;
            System.out.println("Valor de: $" + monto + " Retirado correctamente.");
        }else if (monto > saldo){
            //si el monto supera al saldo, fondos insuficientes
            System.out.println("Fondos insuficientes.");
        }else System.out.println("Ingrese un valor válido.");
    }
}
