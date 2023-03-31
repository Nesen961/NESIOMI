

package egg.pooej03;

import Entidad.Operacion;


public class POOEj03 {

    public static void main(String[] args) {
       Operacion suma1 = new Operacion(10,15);
        System.out.println("El resultado de la suma es: "+ suma1.sumar());
        Operacion resta1= new Operacion();
        resta1.setNumero1(5);
        System.out.println("El minuendo es: "+ resta1.getNumero1());
        resta1.setNumero2(3);
        System.out.println("El sustraendo es: "+ resta1.getNumero2());
        System.out.println("La resta es: "+ resta1.restar());
        Operacion multiplicacion1 = new Operacion();
        multiplicacion1.crearOperacion();
        System.out.println("El producto de ambos numeros es: "+multiplicacion1.multiplicar());
        Operacion dividir1 = new Operacion(20,3);
        System.out.println("El resultado de la division es: "+ dividir1.dividir());
        
    }
}
