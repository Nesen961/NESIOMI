

package egg.extra5cuenta;

import Entidad.Cuenta;
import java.util.Scanner;


public class Extra5Cuenta {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in); 
     Cuenta cajahorro = new Cuenta();
        System.out.println("Ingrese la cantidad de dinero que quiere sacar");
        cajahorro.retirar_dinero(leer.nextDouble());
        System.out.println("Su saldo es:"+cajahorro.getSaldo());  
    }
}
