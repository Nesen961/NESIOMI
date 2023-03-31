/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
*/

package Entidad;


public class Cuenta {
    //declaro atributos
    private double saldo;
    private String titular;
    
    //creo el constructor e inicializo el saldo con $10000

    public Cuenta() {
        this.saldo=100000.00;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double retirar_dinero(double pesos){
        if ((this.saldo-pesos)<0) 
            System.out.println("Su saldo es insuficiente para retirar esa cantidad de dinero");
        else
            this.saldo-=pesos;
    return this.saldo;    
        
    }
    

}
