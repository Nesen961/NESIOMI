/*
 
 */

package egg.pooej02;

import Entidad.Circunferencia;


public class POOEj02 {

    public static void main(String[] args) {
     // cargar atributo utilizando el constructor
       Circunferencia c1 = new Circunferencia(4);
        System.out.println("El perimetro con constructor es: "+ c1.perimetro());
        System.out.println("El area con constructor es: "+ c1.area());
        //cargar atributo utilizando el setter
        Circunferencia c2 = new Circunferencia();
        c2.setRadio(3);
        System.out.println("El radio con get es: "+ c2.getRadio());
        System.out.println("El perimetro con set es: "+ c2.perimetro());
        System.out.println("El area con set es: "+ c2.area());
        // cargar atributo utilizando el metodo crearCircunferencia
        Circunferencia c3 = new Circunferencia();
        c3.crearCircunferencia(2);
        System.out.println("El perimetro con metodo crear... es: "+ c3.perimetro());
        System.out.println("El area con metodocrear... es: "+ c3.area());  
    }
}
