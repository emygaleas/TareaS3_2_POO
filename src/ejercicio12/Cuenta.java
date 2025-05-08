package ejercicio12;

public class Cuenta {
    //se encapsula saldo
    private double saldo;

    //metodo para consultar saldo
    public double getSaldo(){
        return saldo;
    }

    //metodo para validar el monto del deposito
    public void depositar(double monto){
        //si el monto es positivo, se deposita
        if (monto > 0 ) {
            this.saldo += monto;
            System.out.println("Monto $" + monto + " depositado correctamente.");
        }
        else System.out.println("Ingrese un valor válido.");
    }

    //metodo para validar el monto del retiro
    public void retirar(double monto){
        //si el monto es mayor a cero y menor al saldo disponible, se retira
        if (monto > 0 && monto < saldo ){
            this.saldo -= monto;
            System.out.println("Monto de $" + monto + " retirado correctamente.");
        }else if (monto > saldo){
            System.out.println("Fondos insuficientes.");
        }else System.out.println("Ingrese un valor válido.");
    }
}
